package com.carolinacrib.monthly_cost_calculator;

import java.text.NumberFormat;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String showCalculator() {
        return "index";
    }

    @PostMapping("/calculate")
    public String calculateCost(
            @RequestParam String apartmentName,
            @RequestParam String baseRent,
            @RequestParam String parkingFee,
            @RequestParam String utilitiesFee,
            Model model) {

        try {
            double rent = Double.parseDouble(baseRent);
            double parking = Double.parseDouble(parkingFee);
            double utilities = Double.parseDouble(utilitiesFee);

            if (rent < 0 || parking < 0 || utilities < 0 || apartmentName.trim().isEmpty()) {
                model.addAttribute("error", "Please enter an apartment name and non-negative costs.");
                return "index";
            }

            double total = rent + parking + utilities;
            NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);

            model.addAttribute("apartmentName", apartmentName);
            model.addAttribute("total", currency.format(total));

        } catch (NumberFormatException e) {
            model.addAttribute("error", "Please enter valid numbers for all costs.");
        }

        return "index";
    }
}