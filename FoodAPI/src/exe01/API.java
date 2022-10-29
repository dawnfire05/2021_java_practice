package exe01;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.BufferedReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class API {
    public static void main(String[] args) /*throws IOException */{
        String key = "16c6ed183ccf402dbff0d174ff8a04d7";

        String result = "";
        
        //오늘 날짜 가져오기
        LocalDate today = LocalDate.now();
        LocalDate date = today;
        
        //요일 구하기
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        int dayOfWeekNumber = dayOfWeek.getValue();
        System.out.println(dayOfWeekNumber);
        
        //주말이라면 월요일 날짜로
        switch (dayOfWeekNumber) {
        case 6:date = date.plusDays(2);
        case 7:date = date.plusDays(1);
        default: break;
        }
        
        String dt = String.valueOf(LocalDate.parse(date.toString()));

        String[] str = dt.split("-");
        dt = "";
        for(int i = 0; i<str.length; i++)
            dt += str[i];
       
        
        

        try {

            URL url = new URL("https://open.neis.go.kr/hub/mealServiceDietInfo?key="
                    + key + "&Type=jsonp&Index=1&pSize=100&ATPT_OFCDC_SC_CODE=B10&SD_SCHUL_CODE=7010126&MLSV_FROM_YMD=" + dt + "&MLSV_TO_YMD=" + dt);

            BufferedReader bf;

            bf = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));

            result = bf.readLine();

            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject)jsonParser.parse(result);
            JSONArray mealServiceDietInfo  = (JSONArray) jsonObject.get("mealServiceDietInfo");
            JSONObject info = (JSONObject) mealServiceDietInfo.get(1);
            JSONArray row = (JSONArray) info.get("row");

            JSONObject lunch = (JSONObject) row.get(0);
            JSONObject dinner = (JSONObject) row.get(1);

            System.out.println(lunch.get("DDISH_NM"));
            System.out.println(dinner.get("DDISH_NM"));
            
            Object lunchfortoday = (Object) lunch.get("DDISH_NM");
            System.out.println(lunchfortoday.toString());

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}