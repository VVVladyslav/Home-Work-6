package org.example;

public class Main {
    
    public static void main(String[] args){

        new DatabaseInitService();
        new DatabasePopulateService();
        DatabaseQueryService databaseQueryService = new DatabaseQueryService();
        databaseQueryService.findMaxSalaryCountWorker();
        databaseQueryService.findMaxProjectsClient();
        databaseQueryService.findLongestProject();
        databaseQueryService.findYoungestOldestPerson();
        databaseQueryService.findProjectPrice();

        DeletObjects deletObjects = new DeletObjects();
        deletObjects.sendDelet();
    }
}
