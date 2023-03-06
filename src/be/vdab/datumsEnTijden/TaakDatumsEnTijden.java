package be.vdab.datumsEnTijden;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Geef je geboortedatum in: ");
        var geboorteDatumString = scanner.next();
        var geboorteDatum = LocalDate.parse(geboorteDatumString, formatter);
        var vandaag = LocalDate.now();
        var leeftijd = vandaag.getYear() - geboorteDatum.getYear();
        System.out.println(geboorteDatum.getDayOfWeek());
        System.out.println("Je bent " + leeftijd + " jaar.");
    }
}

