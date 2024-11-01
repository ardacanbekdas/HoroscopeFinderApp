package PatikaOdevlerVePratikler;

import java.util.Scanner;

public class HoroscopeFinderApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int day, month;

        System.out.print("Please enter your birth month: ");
        month = input.nextInt();

        System.out.print("Please enter your birth date: ");
        day = input.nextInt();

        if (month < 13 && month > 0) {
        } else {
            System.out.println("You entered wrong month.");
        }

        switch (month) {
            case 1:
                if (day < 32 && day > 0) {
                    if (day <= 21) {
                        System.out.println("Your horoscope is Capricorn.");
                    } else {
                        System.out.println("Your horoscope is Aquarius.");
                    }
                } else {
                    System.out.println("You entered the wrong day.");
                }
                break;
            case 2:
                if (day < 30 && day > 0) {
                    if (day <= 19) {
                        System.out.println("Your horoscope is Aquarius .");
                    } else {
                        System.out.println("Your horoscope is Pisces.");
                    }
                } else {
                    System.out.println("You entered the wrong day.");
                }
                break;
            case 3:
                if (day < 32 && day > 0) {
                    if (day <= 20) {
                        System.out.println("Your horoscope is Pisces.");
                    } else {
                        System.out.println("Your horoscope is Aries.");
                    }
                } else {
                    System.out.println("You entered the wrong day.");
                }
                break;
            case 4:
                if (day < 31 && day > 0) {
                    if (day <= 20) {
                        System.out.println("Your horoscope is Aries.");
                    } else {
                        System.out.println("Your horoscope is Taurus.");
                    }
                } else {
                    System.out.println("You entered the wrong day.");
                }
                break;
            case 5:
                if (day < 32 && day > 0) {
                    if (day <= 21) {
                        System.out.println("Your horoscope is Taurus.");
                    } else {
                        System.out.println("Your horoscope is Gemini.");
                    }
                } else {
                    System.out.println("You entered the wrong day.");
                }
                break;
            case 6:
                if (day < 31 && day > 0) {
                    if (day <= 22) {
                        System.out.println("Your horoscope is Gemini.");
                    } else {
                        System.out.println("Your horoscope is Cancer.");
                    }
                } else {
                    System.out.println("You entered the wrong day.");
                }
                break;
            case 7:
                if (day < 32 && day > 0) {
                    if (day <= 22) {
                        System.out.println("Your horoscope is Cancer.");
                    } else {
                        System.out.println("Your horoscope is Leo.");
                    }
                } else {
                    System.out.println("You entered the wrong day.");
                }
                break;
            case 8:
                if (day < 32 && day > 0) {
                    if (day <= 22) {
                        System.out.println("Your horoscope is Leo .");
                    } else {
                        System.out.println("Your horoscope is Virgo.");
                    }
                } else {
                    System.out.println("You entered the wrong day.");
                }
                break;
            case 9:
                if (day < 31 && day > 0) {
                    if (day <= 22) {
                        System.out.println("Your horoscope is Virgo.");
                    } else {
                        System.out.println("Your horoscope is Libra.");
                    }
                } else {
                    System.out.println("You entered the wrong day.");
                }
                break;
            case 10:
                if (day < 32 && day > 0) {
                    if (day <= 22) {
                        System.out.println("Your horoscope is Libra.");
                    } else {
                        System.out.println("Your horoscope is Scorpio.");
                    }
                } else {
                    System.out.println("You entered the wrong day.");
                }
                break;
            case 11:
                if (day < 31 && day > 0) {
                    if (day <= 21) {
                        System.out.println("Your horoscope is Scorpio.");
                    } else {
                        System.out.println("Your horoscope is Sagittarius.");
                    }
                } else {
                    System.out.println("You entered the wrong day.");
                }
                break;
            case 12:
                if (day < 32 && day > 0) {
                    if (day <= 21) {
                        System.out.println("Your horoscope is Sagittarius.");
                    } else {
                        System.out.println("Your horoscope is Capricorn.");
                    }
                } else {
                    System.out.println("You entered the wrong day.");
                }
                break;
            default:
        }
    }
}



/*
Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat

Balık Burcu : 20 Şubat - 20 Mart
*/
