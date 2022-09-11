public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public MyTime(int hour, int minute, int second) {
        // validate hour, minute and second
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
            throw new IllegalArgumentException("hour, minute and/or second was out of range");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        // validate hour, minute and second
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
            throw new IllegalArgumentException("hour, minute and/or second was out of range");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setHour(int hour) {
        // validate hour
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour was out of range");
        }

        this.hour = hour;
    }

    public void setMinute(int minute) {
        // validate minute
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute was out of range");
        }

        this.minute = minute;
    }

    public void setSecond(int second) {
        // validate second
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second was out of range");
        }

        this.second = second;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

    public MyTime nextSecond() {
        this.second++;
        if (this.second == 60) {
            this.second = 0;
            this.minute++;
            if (this.minute == 60) {
                this.minute = 0;
                this.hour++;
                if (this.hour == 24) {
                    this.hour = 0;
                }
            }
        }
        return this;
    }

    public MyTime previousSecond() {
        this.second--;
        if (this.second == -1) {
            this.second = 59;
            this.minute--;
            if (this.minute == -1) {
                this.minute = 59;
                this.hour--;
                if (this.hour == -1) {
                    this.hour = 23;
                }
            }
        }
        return this;
    }

    public MyTime nextMinute() {
        this.minute++;
        if (this.minute == 60) {
            this.minute = 0;
            this.hour++;
            if (this.hour == 24) {
                this.hour = 0;
            }
        }
        return this;
    }

    public MyTime previousMinute() {
        this.minute--;
        if (this.minute == -1) {
            this.minute = 59;
            this.hour--;
            if (this.hour == -1) {
                this.hour = 23;
            }
        }
        return this;
    }

    public MyTime nextHour() {
        this.hour++;
        if (this.hour == 24) {
            this.hour = 0;
        }
        return this;
    }

    public MyTime previousHour() {
        this.hour--;
        if (this.hour == -1) {
            this.hour = 23;
        }
        return this;
    }
}