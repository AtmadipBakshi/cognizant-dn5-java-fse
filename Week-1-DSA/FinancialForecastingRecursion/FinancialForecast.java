public class FinancialForecast {

    
    public static double forecast(double initialValue, double rate, int years) {

        
        if (years == 0) {
            return initialValue;
        }

       
        return forecast(initialValue, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {

        double initialValue = 10000; // starting amount
        double rate = 0.10;          // 10% growth per year
        int years = 5;               // forecast period

        double result = forecast(initialValue, rate, years);

        System.out.println("Initial Value: " + initialValue);
        System.out.println("Growth Rate: " + (rate * 100) + "%");
        System.out.println("Years: " + years);
        System.out.println("Future Value: " + result);
    }
}