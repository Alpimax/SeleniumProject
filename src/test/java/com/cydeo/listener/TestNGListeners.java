package com.cydeo.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("********1"+ result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("********2"+result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("********3"+result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("********4"+result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("********5"+result.getName());
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("********6"+result.getName());
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("*******7"+context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("********8"+context.getName());
    }
}
