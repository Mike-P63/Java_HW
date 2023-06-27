package ExeptionsClassWork1;

import java.util.Random;
import java.util.Scanner;
public class ClassWork {
        static Scanner scanner = new Scanner(System.in);
        static Random random = new Random();

        public static void main(String[] args) {
            // System.out.printf("Р”Р»РёРЅР° РјР°СЃСЃРёРІР°: %d\n", task1(new int[]{2,3,4,4}));
            // task2();
            // task3();
            task4();
        }

        /**
         Р РµР°Р»РёР·СѓР№С‚Рµ РјРµС‚РѕРґ, РїСЂРёРЅРёРјР°СЋС‰РёР№ РІ РєР°С‡РµСЃС‚РІРµ Р°СЂРіСѓРјРµРЅС‚Р° С†РµР»РѕС‡РёСЃР»РµРЅРЅС‹Р№ РјР°СЃСЃРёРІ.
         Р•СЃР»Рё РґР»РёРЅР° РјР°СЃСЃРёРІР° РјРµРЅСЊС€Рµ РЅРµРєРѕС‚РѕСЂРѕРіРѕ Р·Р°РґР°РЅРЅРѕРіРѕ РјРёРЅРёРјСѓРјР°, РјРµС‚РѕРґ РІРѕР·РІСЂР°С‰Р°РµС‚
         -1, РІ РєР°С‡РµСЃС‚РІРµ РєРѕРґР° РѕС€РёР±РєРё, РёРЅР°С‡Рµ - РґР»РёРЅСѓ РјР°СЃСЃРёРІР°.
         */

        public static int task1(int[] arr){
            if (arr.length < 2){
                return -1;
            }
            return arr.length;
        }

        /**
         Р РµР°Р»РёР·СѓР№С‚Рµ РјРµС‚РѕРґ, РїСЂРёРЅРёРјР°СЋС‰РёР№ РІ РєР°С‡РµСЃС‚РІРµ Р°СЂРіСѓРјРµРЅС‚Р° С†РµР»РѕС‡РёСЃР»РµРЅРЅС‹Р№ РјР°СЃСЃРёРІ Рё РЅРµРєРѕС‚РѕСЂРѕРµ Р·РЅР°С‡РµРЅРёРµ.
         РњРµС‚РѕРґ РёС‰РµС‚ РІ РјР°СЃСЃРёРІРµ Р·Р°РґР°РЅРЅРѕРµ Р·РЅР°С‡РµРЅРёРµ Рё РІРѕР·РІСЂР°С‰Р°РµС‚ РµРіРѕ РёРЅРґРµРєСЃ. РџСЂРё СЌС‚РѕРј, РЅР°РїСЂРёРјРµСЂ:
         1. РµСЃР»Рё РґР»РёРЅР° РјР°СЃСЃРёРІР° РјРµРЅСЊС€Рµ РЅРµРєРѕС‚РѕСЂРѕРіРѕ Р·Р°РґР°РЅРЅРѕРіРѕ РјРёРЅРёРјСѓРјР°, РјРµС‚РѕРґ РІРѕР·РІСЂР°С‰Р°РµС‚ -1, РІ РєР°С‡РµСЃС‚РІРµ РєРѕРґР° РѕС€РёР±РєРё.
         2. РµСЃР»Рё РёСЃРєРѕРјС‹Р№ СЌР»РµРјРµРЅС‚ РЅРµ РЅР°Р№РґРµРЅ, РјРµС‚РѕРґ РІРµСЂРЅРµС‚ -2 РІ РєР°С‡РµСЃС‚РІРµ РєРѕРґР° РѕС€РёР±РєРё.
         3. РµСЃР»Рё РІРјРµСЃС‚Рѕ РјР°СЃСЃРёРІР° РїСЂРёС€РµР» null, РјРµС‚РѕРґ РІРµСЂРЅРµС‚ -3
         РќР°РїРёС€РёС‚Рµ РјРµС‚РѕРґ, РІ РєРѕС‚РѕСЂРѕРј СЂРµР°Р»РёР·СѓР№С‚Рµ РІР·Р°РёРјРѕРґРµР№СЃС‚РІРёРµ СЃ РїРѕР»СЊР·РѕРІР°С‚РµР»РµРј.
         РўРѕ РµСЃС‚СЊ, СЌС‚РѕС‚ РјРµС‚РѕРґ Р·Р°РїСЂРѕСЃРёС‚ РёСЃРєРѕРјРѕРµ С‡РёСЃР»Рѕ Сѓ РїРѕР»СЊР·РѕРІР°С‚РµР»СЏ, РІС‹Р·РѕРІРµС‚ РїРµСЂРІС‹Р№,
         РѕР±СЂР°Р±РѕС‚Р°РµС‚ РІРѕР·РІСЂР°С‰РµРЅРЅРѕРµ Р·РЅР°С‡РµРЅРёРµ Рё РїРѕРєР°Р¶РµС‚ С‡РёС‚Р°РµРјС‹Р№ СЂРµР·СѓР»СЊС‚Р°С‚ РїРѕР»СЊР·РѕРІР°С‚РµР»СЋ.
         РќР°РїСЂРёРјРµСЂ, РµСЃР»Рё РІРµСЂРЅСѓР»СЃСЏ -2, РїРѕР»СЊР·РѕРІР°С‚РµР»СЋ РІС‹РІРµРґРµС‚СЃСЏ СЃРѕРѕР±С‰РµРЅРёРµ: вЂњРСЃРєРѕРјС‹Р№ СЌР»РµРјРµРЅС‚ РЅРµ РЅР°Р№РґРµРЅвЂќ.
         */

        public static void task2(){
            while(true){
                System.out.println("РЈРєР°Р¶РёС‚Рµ С‡РёСЃР»Рѕ РґР»СЏ РїРѕРёСЃРєР°: ");
                if (scanner.hasNextInt()){
                    int searchNumber = scanner.nextInt();
                    int[] array = new int[random.nextInt(5) + 1];
                    if (random.nextInt(2)== 0){
                        array = null;
                    }
                    else{
                        for (int i = 0; i < array.length; i++) {
                            array[i] = random.nextInt(10);
                            System.out.printf("%d\t", array[i]);
                        }
                        System.out.println();
                    }
                    int codeResult = processArray(array, searchNumber);
                    if (codeResult == -1){
                        System.out.println("Р”Р»РёРЅР° РјР°СЃСЃРёРІР° РјРµРЅРµРµ 3 СЌР»РµРјРµРЅС‚РѕРІ");
                    }
                    else if (codeResult == -2){
                        System.out.println("РР»РµРјРµРЅС‚ РЅРµ РЅР°Р№РґРµРЅ");
                    }
                    else if (codeResult == -3){
                        System.out.println("РњР°СЃСЃРёРІ РЅРµРєРѕСЂСЂРµРєС‚РЅРѕ РїСЂРѕРёРЅРёС†РёР°Р»РёР·РёСЂРѕРІР°РЅ");
                    }
                    else{
                        System.out.println("РњР°СЃСЃРёРІ СѓСЃРїРµС€РЅРѕ РѕР±СЂР°Р±РѕС‚Р°РЅ. Р—Р°РІСЂРµС€РµРЅРёРµ СЂР°Р±РѕС‚С‹ РїСЂРёР»РѕР¶РµРЅРёСЏ");
                        System.out.printf("РР»РµРјРµРЅС‚ РЅР°Р№РґРµРЅ РїРѕ РёРЅРґРµРєСЃСѓ %d \n", codeResult);
                        return;
                    }
                }
                else{
                    System.out.println("Р§РёСЃР»Рѕ РґР»СЏ РїРѕРёСЃРєР° СѓРєР°Р·Р°РЅРѕ РЅРµРєРѕСЂСЂРµРєС‚РЅРѕ.\nРџРѕРІС‚РѕСЂРёС‚Рµ РІРІРѕРґ С‡РёСЃР»Р°");
                    scanner.nextLine();
                }
            }
        }


        static int processArray(int[] arr, int searchNumber){
            if (arr == null){
                return -3; //РµСЃР»Рё РІРјРµСЃС‚Рѕ РјР°СЃСЃРёРІР° РїСЂРёС€РµР» null, РјРµС‚РѕРґ РІРµСЂРЅРµС‚ -3
            }
            if (arr.length < 3){
                return -1; //РµСЃР»Рё РґР»РёРЅР° РјР°СЃСЃРёРІР° РјРµРЅСЊС€Рµ РЅРµРєРѕС‚РѕСЂРѕРіРѕ Р·Р°РґР°РЅРЅРѕРіРѕ РјРёРЅРёРјСѓРјР°, РјРµС‚РѕРґ РІРѕР·РІСЂР°С‰Р°РµС‚ -1, РІ РєР°С‡РµСЃС‚РІРµ РєРѕРґР° РѕС€РёР±РєРё.
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == searchNumber){
                    return i;
                }
            }
            return -2; //РµСЃР»Рё РёСЃРєРѕРјС‹Р№ СЌР»РµРјРµРЅС‚ РЅРµ РЅР°Р№РґРµРЅ, РјРµС‚РѕРґ РІРµСЂРЅРµС‚ -2 РІ РєР°С‡РµСЃС‚РІРµ РєРѕРґР° РѕС€РёР±РєРё.
        }

        /**
         * Р РµР°Р»РёР·СѓР№С‚Рµ РјРµС‚РѕРґ, РїСЂРёРЅРёРјР°СЋС‰РёР№ РІ РєР°С‡РµСЃС‚РІРµ Р°СЂРіСѓРјРµРЅС‚Р° С†РµР»РѕС‡РёСЃР»РµРЅРЅС‹Р№ РґРІСѓРјРµСЂРЅС‹Р№ РјР°СЃСЃРёРІ.
         *     РќРµРѕР±С…РѕРґРёРјРѕ РїРѕСЃС‡РёС‚Р°С‚СЊ Рё РІРµСЂРЅСѓС‚СЊ СЃСѓРјРјСѓ СЌР»РµРјРµРЅС‚РѕРІ СЌС‚РѕРіРѕ РјР°СЃСЃРёРІР°.
         *     РџСЂРё СЌС‚РѕРј РЅР°РєР»Р°РґС‹РІР°РµРј РЅР° РјРµС‚РѕРґ 2 РѕРіСЂР°РЅРёС‡РµРЅРёСЏ: РјРµС‚РѕРґ РјРѕР¶РµС‚ СЂР°Р±РѕС‚Р°С‚СЊ С‚РѕР»СЊРєРѕ СЃ РєРІР°РґСЂР°С‚РЅС‹РјРё РјР°СЃСЃРёРІР°РјРё
         *     (РєРѕР»-РІРѕ СЃС‚СЂРѕРє = РєРѕР»-РІСѓ СЃС‚РѕР»Р±С†РѕРІ), Рё РІ РєР°Р¶РґРѕР№ СЏС‡РµР№РєРµ РјРѕР¶РµС‚ Р»РµР¶Р°С‚СЊ С‚РѕР»СЊРєРѕ Р·РЅР°С‡РµРЅРёРµ 0 РёР»Рё 1.
         *     Р•СЃР»Рё РЅР°СЂСѓС€Р°РµС‚СЃСЏ РѕРґРЅРѕ РёР· СѓСЃР»РѕРІРёР№, РјРµС‚РѕРґ РґРѕР»Р¶РµРЅ Р±СЂРѕСЃРёС‚СЊ RuntimeException СЃ СЃРѕРѕР±С‰РµРЅРёРµРј РѕР± РѕС€РёР±РєРµ.
         */

        static void task3(){
            for (int i = 0; i < 5; i++) {
                System.out.printf("\n *** РС‚РµСЂР°С†РёСЏ %d ***\n\n", i+1);
                processArray(generateArray());
            }
        }

        static void processArray(int[][] arr){
            if (arr[0].length != arr.length){
                throw new RuntimeException("РќРµРєРѕСЂСЂРµРєС‚РЅР°СЏ СЂР°Р·РјРµСЂРЅРѕСЃС‚СЊ РјР°СЃСЃРёРІР°");
                // throw new IOException("123");
            }
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] != 0 && arr[i][j]!= 1){
                        throw new RuntimeException(String.format("РќРµРєРѕСЂСЂРµРєС‚РЅРѕРµ Р·РЅР°С‡РµРЅРёРµ РјР°СЃСЃРёРІР° РїРѕ РёРЅРґРµРєСЃСѓ [%d][%d]", i, j));
                    }
                    else{
                        sum += arr[i][j];
                    }
                }
            }
            System.out.printf("РЎСѓРјРјР° СЌР»РµРјРµРЅС‚РѕРІ РјР°СЃСЃРёРІР°: %d\n", sum);
        }

        static int[][] generateArray(){
            int[][] arr = new int[random.nextInt(2)+4][4];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = random.nextInt(2);
                    if (random.nextInt(500) == 0){
                        arr[i][j] = 2; //РЅР°РјРµСЂРµРЅРЅР°СЏ РѕС€РёР±РєР°
                    }
                    System.out.printf("%d ", arr[i][j]);
                }
                System.out.println();
            }
            return arr;
        }


        /**
         Р РµР°Р»РёР·СѓР№С‚Рµ РјРµС‚РѕРґ, РїСЂРёРЅРёРјР°СЋС‰РёР№ РІ РєР°С‡РµСЃС‚РІРµ Р°СЂРіСѓРјРµРЅС‚Р° С†РµР»РѕС‡РёСЃР»РµРЅРЅС‹Р№ РґРІСѓРјРµСЂРЅС‹Р№ РјР°СЃСЃРёРІ.
         РќРµРѕР±С…РѕРґРёРјРѕ РїРѕСЃС‡РёС‚Р°С‚СЊ Рё РІРµСЂРЅСѓС‚СЊ СЃСѓРјРјСѓ СЌР»РµРјРµРЅС‚РѕРІ СЌС‚РѕРіРѕ РјР°СЃСЃРёРІР°.
         РџСЂРё СЌС‚РѕРј РЅР°РєР»Р°РґС‹РІР°РµРј РЅР° РјРµС‚РѕРґ 2 РѕРіСЂР°РЅРёС‡РµРЅРёСЏ: РјРµС‚РѕРґ РјРѕР¶РµС‚ СЂР°Р±РѕС‚Р°С‚СЊ С‚РѕР»СЊРєРѕ СЃ РєРІР°РґСЂР°С‚РЅС‹РјРё РјР°СЃСЃРёРІР°РјРё
         (РєРѕР»-РІРѕ СЃС‚СЂРѕРє = РєРѕР»-РІСѓ СЃС‚РѕР»Р±С†РѕРІ), Рё РІ РєР°Р¶РґРѕР№ СЏС‡РµР№РєРµ РјРѕР¶РµС‚ Р»РµР¶Р°С‚СЊ С‚РѕР»СЊРєРѕ Р·РЅР°С‡РµРЅРёРµ 0 РёР»Рё 1.
         Р•СЃР»Рё РЅР°СЂСѓС€Р°РµС‚СЃСЏ РѕРґРЅРѕ РёР· СѓСЃР»РѕРІРёР№, РјРµС‚РѕРґ РґРѕР»Р¶РµРЅ РІРµСЂРЅСѓС‚СЊ РєРѕРґ РѕС€РёР±РєРё.
         РџСЂРѕРіСЂР°РјРјР° РґРѕР»Р¶РЅР° РєРѕСЂСЂРµРєС‚РЅРѕ РѕР±СЂР°Р±РѕС‚Р°С‚СЊ РєРѕРґ РѕС€РёР±РєРё Рё РІС‹РІРµСЃС‚Рё СЃРѕРѕС‚РІРµС‚СЃС‚РІСѓСЋС‰РµРµ СЃРѕРѕР±С‰РµРЅРёРµ РїРѕР»СЊР·РѕРІР°С‚РµР»СЋ.
         РЎСЂР°РІРЅРёС‚СЊ С‚Р°РєРѕР№ РІР°СЂРёР°РЅС‚ РѕР±СЂР°Р±РѕС‚РєРё РёСЃРєР»СЋС‡РµРЅРёР№ СЃ РїСЂРµРґС‹РґСѓС‰РёРј.
         */

        static void task4(){
            for (int i = 0; i < 5; i++) {
                System.out.printf("\n *** РС‚РµСЂР°С†РёСЏ %d ***\n\n", i+1);
                int errCode = processArrayV2(generateArray());
                if (errCode == -1){
                    System.out.println("РќРµРєРѕСЂСЂРµРєС‚РЅР°СЏ СЂР°Р·РјРµСЂРЅРѕСЃС‚СЊ РјР°СЃСЃРёРІР°.");
                }
                else if (errCode == -2){
                    System.out.println("РќРµРєРѕСЂСЂРµРєС‚РЅРѕРµ Р·РЅР°С‡РµРЅРёРµ РјР°СЃСЃРёРІР°");
                }
                else{
                    System.out.printf("РЎСѓРјРјР° СЌР»РµРјРµРЅС‚РѕРІ РјР°СЃСЃРёРІР°: %d\n", errCode);
                }
            }
        }

        static int processArrayV2 (int[][] arr){
            if (arr.length != arr[0].length){
                return -1;
            }
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] != 0 && arr[i][j] != 1){
                        return -2;
                    }
                    else{
                        sum += arr[i][j];
                    }
                }
            }
            return sum;
        }

    }


