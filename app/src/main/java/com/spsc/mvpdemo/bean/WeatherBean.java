package com.spsc.mvpdemo.bean;

public class WeatherBean {

    /**
     * reason : success
     * result : {"pubTime":"20160716144804","reqTime":"20160716145218","data":{"cw":"03","w":"阵雨","rh":51,"cwd":"06","wd":"西风","wdg":2,"tmp":26,"airp":996,"st":25,"aqi":64,"tip_aqi":"空气良好"}}
     * error_code : 0
     */

    private String reason;
    /**
     * pubTime : 20160716144804
     * reqTime : 20160716145218
     * data : {"cw":"03","w":"阵雨","rh":51,"cwd":"06","wd":"西风","wdg":2,"tmp":26,"airp":996,"st":25,"aqi":64,"tip_aqi":"空气良好"}
     */

    private ResultEntity result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultEntity getResult() {
        return result;
    }

    public void setResult(ResultEntity result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultEntity {
        private String pubTime;
        private String reqTime;
        /**
         * cw : 03
         * w : 阵雨
         * rh : 51
         * cwd : 06
         * wd : 西风
         * wdg : 2
         * tmp : 26
         * airp : 996
         * st : 25
         * aqi : 64
         * tip_aqi : 空气良好
         */

        private DataEntity data;

        public String getPubTime() {
            return pubTime;
        }

        public void setPubTime(String pubTime) {
            this.pubTime = pubTime;
        }

        public String getReqTime() {
            return reqTime;
        }

        public void setReqTime(String reqTime) {
            this.reqTime = reqTime;
        }

        public DataEntity getData() {
            return data;
        }

        public void setData(DataEntity data) {
            this.data = data;
        }

        public static class DataEntity {
            private String cw;
            private String w;
            private int rh;
            private String cwd;
            private String wd;
            private int wdg;
            private int tmp;
            private int airp;
            private int st;
            private int aqi;
            private String tip_aqi;

            public String getCw() {
                return cw;
            }

            public void setCw(String cw) {
                this.cw = cw;
            }

            public String getW() {
                return w;
            }

            public void setW(String w) {
                this.w = w;
            }

            public int getRh() {
                return rh;
            }

            public void setRh(int rh) {
                this.rh = rh;
            }

            public String getCwd() {
                return cwd;
            }

            public void setCwd(String cwd) {
                this.cwd = cwd;
            }

            public String getWd() {
                return wd;
            }

            public void setWd(String wd) {
                this.wd = wd;
            }

            public int getWdg() {
                return wdg;
            }

            public void setWdg(int wdg) {
                this.wdg = wdg;
            }

            public int getTmp() {
                return tmp;
            }

            public void setTmp(int tmp) {
                this.tmp = tmp;
            }

            public int getAirp() {
                return airp;
            }

            public void setAirp(int airp) {
                this.airp = airp;
            }

            public int getSt() {
                return st;
            }

            public void setSt(int st) {
                this.st = st;
            }

            public int getAqi() {
                return aqi;
            }

            public void setAqi(int aqi) {
                this.aqi = aqi;
            }

            public String getTip_aqi() {
                return tip_aqi;
            }

            public void setTip_aqi(String tip_aqi) {
                this.tip_aqi = tip_aqi;
            }
        }
    }
}
