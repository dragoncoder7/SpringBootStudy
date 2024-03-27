package test;


import org.apache.tomcat.util.codec.binary.Base64;

public class test {
    public final String appId = "bae0f5d5-1f4d-4496-9779-5d51f59006dd";
    public final String appSecret = "MDhkM2RhZGMtZTYzOC00NDg3LTkzYmEtYTZkZTFhZDE5YzY3";

    public static void main(String[] args) {
        String sql = "SELECT  event_time,\n" +
                "       job_no,\n" +
                "       person_name,\n" +
                "       date_trunc('day', event_time),\n" +
                "       to_char(event_time, 'yyyy-mm-dd 00:00:00.000') k0700,\n" +
                "       to_char(event_time, '1900-01-01 hh24:mi:ss.000') k0701,\n" +
                "       door_name k0702,\n" +
                "       'hik import' k0703\n" +
                "  from tb_event_view A\n" +
                " WHERE 1 = 1\n" +
                "   and door_name like '考勤%'\n" +
                "   and job_no is not NULL\n" +
                "   and A.utc_event_time >= '1700618095000' "+" \n" +
                "   AND A.utc_event_time < '1700704495000' ";
        System.out.println(sql);
    }

    public static String getHttpBasic(String clientId, String clientSecret){
        String string=clientId+":"+clientSecret;
        //将串进行Base64编码
        String encode = Base64.encodeBase64String(string.getBytes());
        return "Basic "+encode;
    }
}
