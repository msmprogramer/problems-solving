package android.matrix.ooredoo.qa.problems;

public class PhoneFormate {

    static String formmate(String phoneNumber) {

        if (phoneNumber.length() < 2 || phoneNumber.length() > 100) {
            throw new RuntimeException("Invalid Number Count!");
        }

        final int groupBlockLength = 3;

        StringBuilder phoneNumberStringBuilder = new StringBuilder();

        phoneNumber = phoneNumber.replaceAll(
                "[\\s\\-()]",
                ""
        );

        int lastBlockNumbersCount = phoneNumber.length() % groupBlockLength;


        for (int i = 0; i < phoneNumber.length(); i += groupBlockLength) {

            if ((i + lastBlockNumbersCount) > phoneNumber.length() - 1) {
                phoneNumberStringBuilder.append(
                        phoneNumber.substring(i, i + lastBlockNumbersCount)
                );
                break;
            }

            phoneNumberStringBuilder.append(
                    phoneNumber.substring(i, i + groupBlockLength)
            );

            phoneNumberStringBuilder.append("-");

        }


        if (phoneNumberStringBuilder.charAt(phoneNumberStringBuilder.length() - 1) == '-') {
            phoneNumberStringBuilder.deleteCharAt(phoneNumberStringBuilder.length() - 1);
        }

        if (lastBlockNumbersCount == 1) {
            char[] phoneNumberCharsArr = phoneNumberStringBuilder.toString().toCharArray();
            phoneNumberCharsArr[phoneNumberCharsArr.length - 2] = phoneNumberCharsArr[phoneNumberCharsArr.length - 3];
            phoneNumberCharsArr[phoneNumberCharsArr.length - 3] = '-';

            return new String(phoneNumberCharsArr);
        }

        return phoneNumberStringBuilder.toString();
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


}
