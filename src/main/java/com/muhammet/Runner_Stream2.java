package com.muhammet;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner_Stream2 {
    public static void main(String[] args) {
        Stream<Integer> sayilar = Stream.of(1, 2, 3, 4, 5,6,7,8);
        BinaryOperator<Integer> opr = (x,y) -> x * y;
        // Optional -> içinde bir şey var mı = isPresent()  boş mu = isEmpty();
        // eğer içinde bir şey var ise bana ver
        sayilar.reduce(opr).ifPresent(System.out::println);
        Stream<Integer> bosDeste = Stream.empty();
        bosDeste.reduce((x,y)-> x*y).ifPresent(System.out::println);
        sayilar = Stream.of(1, 2, 3, 4, 5,6,7,8);
        sayilar.reduce(opr).ifPresent(sonuc ->{
            System.out.println("Çıkan sonuç.....: "+ sonuc);
        });


        List<String> isimListesi = List.of("Deniz","Zeynep","Eymen","Bahar","Zeynep","Tülay","Inci","Eymen","Serkan","Unal");
        TreeSet<String> setIsimListesi = isimListesi.stream()
                .collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
        /**
         * 1- yeni bir tree oluştur. > new tree
         * 2- bunu içerisine ekelem yap > add
         * 3- bunu tümü için uygula
         */
        System.out.println(setIsimListesi);

        TreeSet<String> setIsimListesi2 = isimListesi.stream()
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("""
                ** Sıralı isim listesi **
                """);
        isimListesi.stream().sorted().forEach(System.out::println);
        System.out.println("------------------------------------------");
        isimListesi.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("""
                ** Tekilleştirme **
                """);
        isimListesi.stream().distinct().sorted().forEach(System.out::println);
    }
}
