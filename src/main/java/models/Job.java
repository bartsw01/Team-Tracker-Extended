package models;

import java.util.ArrayList;

/**
 * Created by Guest on 8/8/17.
 */
public class Job {
    private static ArrayList<Job> instances = new ArrayList<>();
    private String jobTitle;
    private String company;
    private String jobDescription;
    private String companyLocation;
    private String startDate;
    private String endDate;
    private int id;
    private boolean addedJob;

    public Job (String jobTitle, String company, String jobDescription, String companyLocation, String startDate, String endDate){
        this.jobTitle = jobTitle;
        this.company = company;
        this.jobDescription = jobDescription;
        this.companyLocation = companyLocation;
        this.startDate = startDate;
        this.endDate = endDate;
        instances.add(this);
        this.id = instances.size();
        this.addedJob = false;
    }

    public String getJobTitle(){
        return this.jobTitle;
    }

    public static ArrayList<Job> getAll(){
        return instances;
    }

    public String getCompany() {
        return company;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public String getCompanyLocation() {
        return companyLocation;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public int getId() {
        return id;
    }

    public boolean getAddedJob(){
        return this.addedJob;
    }

    public static Job findById(int id){
        return instances.get(id-1);
    }

    public static void clearAllJobs(){
        instances.clear();
    }

}
