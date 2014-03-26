/**
 * Created by Mladjan on 26.3.2014.
 */
public class RomanCalculator {

    Integer[] arabicNumber = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] romanNumber = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};


    public String addRoman(String firstRoman, String secondRoman) {
        int firstArabic = convertToArabic(firstRoman);
        int secondArabic = convertToArabic(secondRoman);
        int sumOfArabic = addDecimal(firstArabic, secondArabic);
        String sumOfRoman = convertToRoman(sumOfArabic);
        return sumOfRoman;
    }

    private String convertToRoman(int sumOfArabic) {
        String roman = "";
        for(int j = 0; j < romanNumber.length ; j++)
            while(sumOfArabic >= arabicNumber[j]) {
                roman += romanNumber[j];
                sumOfArabic -= arabicNumber[j];
            }

        return roman;
    }

    public int convertToArabic(String roman) {
       int arabic = 0;
           for (int i = 0 ; i < romanNumber.length ; i ++ ) {
                   while (roman.startsWith(romanNumber[i])) {
                       if(i%2 !=0) {
                           roman = roman.substring(2);
                       }
                       else {
                           roman = roman.substring(1);
                       }
                       arabic += arabicNumber[i];
                   }
           }
            return arabic;
        }


    public int addDecimal(int first, int second) {
        int sum = first + second;
        return sum;
    }
}
