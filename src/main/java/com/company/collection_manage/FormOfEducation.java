package com.company.collection_manage;

public enum  FormOfEducation {
    DISTANCE_EDUCATION, FULL_TIME_EDUCATION, EVENING_CLASSES;
        public static String GetStringValues() {
            StringBuilder Result = new StringBuilder();
            for (int i = 0; i < values().length; i++ ) {
                Result.append(i).append(" - ").append(values()[i]).append(" | ");
            }
            return Result.toString();
        }
        public static FormOfEducation NullString(String input) {
            if(input == null || input.isEmpty()) {
                return null;
            }
            else {
             return FormOfEducation.values()[Integer.parseInt(input)];
            }
        }

}