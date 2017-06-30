package com.example.developerhaoz.haozweather.db;

import java.util.List;

/**
 * 天气的实体类
 *
 * Created by developerHaoz on 2017/6/30.
 */

public class HeWeatherBean {


    /**
     * daily_forecast : [{"astro":{"mr":"11:46","ms":"12:43","sr":"05:44","ss":"19:16"},"cond":{"code_d":"104","code_n":"101","txt_d":"阴","txt_n":"多云"},"date":"2017-06-30","hum":"81","pcpn":"0.5","pop":"99","pres":"1008","tmp":{"max":"35","min":"27"},"uv":"10","vis":"13","wind":{"deg":"159","dir":"无持续风向","sc":"微风","spd":"5"}},{"astro":{"mr":"12:39","ms":"00:15","sr":"05:44","ss":"19:16"},"cond":{"code_d":"302","code_n":"302","txt_d":"雷阵雨","txt_n":"雷阵雨"},"date":"2017-07-01","hum":"84","pcpn":"13.6","pop":"100","pres":"1006","tmp":{"max":"34","min":"28"},"uv":"12","vis":"17","wind":{"deg":"162","dir":"无持续风向","sc":"微风","spd":"3"}},{"astro":{"mr":"13:31","ms":"00:52","sr":"05:45","ss":"19:16"},"cond":{"code_d":"302","code_n":"101","txt_d":"雷阵雨","txt_n":"多云"},"date":"2017-07-02","hum":"85","pcpn":"29.5","pop":"100","pres":"1005","tmp":{"max":"33","min":"28"},"uv":"11","vis":"16","wind":{"deg":"176","dir":"无持续风向","sc":"微风","spd":"5"}}]
     * hourly_forecast : [{"cond":{"code":"103","txt":"晴间多云"},"date":"2017-06-30 22:00","hum":"82","pop":"0","pres":"1008","tmp":"28","wind":{"deg":"159","dir":"东南风","sc":"微风","spd":"11"}}]
     * now : {"cond":{"code":"104","txt":"阴"},"fl":"36","hum":"65","pcpn":"0","pres":"1005","tmp":"30","vis":"10","wind":{"deg":"140","dir":"东南风","sc":"微风","spd":"8"}}
     * status : ok
     * suggestion : {"comf":{"brf":"很不舒适","txt":"白天虽然天气以阴为主，但由于天热，加上湿度较大，您会感到很闷热，很不舒适。"},"cw":{"brf":"不宜","txt":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"},"drsg":{"brf":"炎热","txt":"天气炎热，建议着短衫、短裙、短裤、薄型T恤衫等清凉夏季服装。"},"flu":{"brf":"少发","txt":"各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。"},"sport":{"brf":"较不宜","txt":"有降水，推荐您在室内进行低强度运动；若坚持户外运动，请选择合适的运动，并携带雨具。"},"trav":{"brf":"一般","txt":"微风，感觉比较热，有降水，降雨期间请尽量不要外出，若外出，请注意防雷。"},"uv":{"brf":"中等","txt":"属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"}}
     */
    private NowBean now;
    private String status;
    private List<DailyForecastBean> daily_forecast;

    public NowBean getNow() {
        return now;
    }

    public void setNow(NowBean now) {
        this.now = now;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<DailyForecastBean> getDaily_forecast() {
        return daily_forecast;
    }

    public void setDaily_forecast(List<DailyForecastBean> daily_forecast) {
        this.daily_forecast = daily_forecast;
    }

    public static class NowBean {
        /**
         * cond : {"code":"104","txt":"阴"}
         * fl : 36
         * hum : 65
         * pcpn : 0
         * pres : 1005
         * tmp : 30
         * vis : 10
         * wind : {"deg":"140","dir":"东南风","sc":"微风","spd":"8"}
         */

        private CondBean cond;
        private String hum;
        private String tmp;
        private WindBean wind;

        public CondBean getCond() {
            return cond;
        }

        public void setCond(CondBean cond) {
            this.cond = cond;
        }

        public String getHum() {
            return hum;
        }

        public void setHum(String hum) {
            this.hum = hum;
        }

        public String getTmp() {
            return tmp;
        }

        public void setTmp(String tmp) {
            this.tmp = tmp;
        }

        public WindBean getWind() {
            return wind;
        }

        public void setWind(WindBean wind) {
            this.wind = wind;
        }

        public static class CondBean {
            /**
             * txt : 阴
             */

            private String txt;

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }

        public static class WindBean {
            /**
             * deg : 140
             * dir : 东南风
             * sc : 微风
             * spd : 8
             */

            private String deg;
            private String dir;
            private String sc;
            private String spd;

            public String getDeg() {
                return deg;
            }

            public void setDeg(String deg) {
                this.deg = deg;
            }

            public String getDir() {
                return dir;
            }

            public void setDir(String dir) {
                this.dir = dir;
            }

            public String getSc() {
                return sc;
            }

            public void setSc(String sc) {
                this.sc = sc;
            }

            public String getSpd() {
                return spd;
            }

            public void setSpd(String spd) {
                this.spd = spd;
            }
        }
    }

    public static class DailyForecastBean {
        /**
         * astro : {"mr":"11:46","ms":"12:43","sr":"05:44","ss":"19:16"}
         * cond : {"code_d":"104","code_n":"101","txt_d":"阴","txt_n":"多云"}
         * date : 2017-06-30
         * hum : 81
         * pcpn : 0.5
         * pop : 99
         * pres : 1008
         * tmp : {"max":"35","min":"27"}
         * uv : 10
         * vis : 13
         * wind : {"deg":"159","dir":"无持续风向","sc":"微风","spd":"5"}
         */

        private CondBeanX cond;
        private TmpBean tmp;
        private WindBeanX wind;

        public CondBeanX getCond() {
            return cond;
        }

        public void setCond(CondBeanX cond) {
            this.cond = cond;
        }

        public TmpBean getTmp() {
            return tmp;
        }

        public void setTmp(TmpBean tmp) {
            this.tmp = tmp;
        }

        public WindBeanX getWind() {
            return wind;
        }

        public void setWind(WindBeanX wind) {
            this.wind = wind;
        }

        public static class CondBeanX {
            /**
             * code_d : 104
             * code_n : 101
             * txt_d : 阴
             * txt_n : 多云
             */
            private String txt_d;
            private String txt_n;

            public String getTxt_d() {
                return txt_d;
            }

            public void setTxt_d(String txt_d) {
                this.txt_d = txt_d;
            }

            public String getTxt_n() {
                return txt_n;
            }

            public void setTxt_n(String txt_n) {
                this.txt_n = txt_n;
            }
        }

        public static class TmpBean {
            /**
             * max : 35
             * min : 27
             */

            private String max;
            private String min;

            public String getMax() {
                return max;
            }

            public void setMax(String max) {
                this.max = max;
            }

            public String getMin() {
                return min;
            }

            public void setMin(String min) {
                this.min = min;
            }
        }

        public static class WindBeanX {
            /**
             * deg : 159
             * dir : 无持续风向
             * sc : 微风
             * spd : 5
             */

            private String deg;
            private String dir;
            private String sc;
            private String spd;

            public String getDeg() {
                return deg;
            }

            public void setDeg(String deg) {
                this.deg = deg;
            }

            public String getDir() {
                return dir;
            }

            public void setDir(String dir) {
                this.dir = dir;
            }

            public String getSc() {
                return sc;
            }

            public void setSc(String sc) {
                this.sc = sc;
            }

            public String getSpd() {
                return spd;
            }

            public void setSpd(String spd) {
                this.spd = spd;
            }
        }
    }
}
