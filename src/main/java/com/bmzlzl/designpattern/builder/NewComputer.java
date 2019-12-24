package com.bmzlzl.designpattern.builder;

/**
 * 抽象建造者
 *
 * @author jagger
 * @create 2019-12-24 8:32
 **/
public class NewComputer {
    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;

    public NewComputer() {
        throw new RuntimeException("can’t init");
    }

    private NewComputer(Builder builder) {
        cpu = builder.cpu;
        screen = builder.screen;
        memory = builder.memory;
        mainboard = builder.mainboard;
    }

    public static final class Builder {
        private String cpu;
        private String screen;
        private String memory;
        private String mainboard;

        public Builder() {
        }

        public Builder cpu(String val) {
            cpu = val;
            return this;
        }

        public Builder screen(String val) {
            screen = val;
            return this;
        }

        public Builder memory(String val) {
            memory = val;
            return this;
        }

        public Builder mainboard(String val) {
            mainboard = val;
            return this;
        }

        public NewComputer build() {
            return new NewComputer(this);
        }
    }
}