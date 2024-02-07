package random.amz.countUrls;

import java.time.LocalDateTime;
import java.util.*;

public class main {
    public static void main(String[] args) {
//
//        String fileName = "/src/main/java/random/amazon/countUrls/log.txt";
//        List<Log> logs = new ArrayList<>();
//
//        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                String[] parts = line.split(",");
//                Long customerId = Long.parseLong(parts[0]);
//                LocalDateTime timeStamp = LocalDateTime.parse(parts[1]);
//                String visitedUrl = parts[2];
//                Log log = new Log(customerId, visitedUrl, timeStamp);
//                logs.add(log);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        for (Log log : logs) {
//            System.out.println(log);
//        }
//    }

        List<Long> customerIDs = Arrays.asList(1L, 2L, 3L);
        List<Log> logs = Arrays.asList(
                new Log(1L, "amazon.com", LocalDateTime.now()),
                new Log(1L, "google.com", LocalDateTime.now()),
                new Log(2L, "amazon.com", LocalDateTime.now()),
                new Log(2L, "google.com", LocalDateTime.now()),
                new Log(2L, "amazon.com", LocalDateTime.now()),
                new Log(3L, "etsy.com", LocalDateTime.now()),
                new Log(3L, "amazon.com", LocalDateTime.now()),
                new Log(3L, "google.com", LocalDateTime.now()),
                new Log(3L, "google.com", LocalDateTime.now()),
                new Log(3L, "google.com", LocalDateTime.now()));

//        System.out.println(logs);

        Map<Long, Map<String, Integer>> visitedUrlsByIds = new HashMap<>();
        for (Long customerID : customerIDs) {
            visitedUrlsByIds.put(customerID, visitedURLsById(customerID, logs));
        }

//        System.out.println(visitedURLsById(3L, logs));
        System.out.println(visitedUrlsByIds);
    }

    public static Map<String, Integer> visitedURLsById(Long customerID, List<Log> logs) {
        Map<String, Integer> visitedURLsById = new HashMap<>();
        for (Log log : logs) {
            if (log.getCustomerId().equals(customerID)) {
                String url = log.getUrl();
                visitedURLsById.put(url, visitedURLsById.getOrDefault(url, 0) + 1);
            }
        }
        return visitedURLsById;

    }

    /*
    There are List of customer ids and there are different urls. There is a logs file tracking which customer access which url
    In the file implementation -> first line is timestamp then url then customer id

    Print customer id with unique url and count

    ex: 1234 customer id,
    First - visits amazon.com
    Second - visits amazon.com
    Third - visits gmail.com
     */


}