package com.sudhirkumar.simcardapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SimRecord {
      @Id
      @GeneratedValue
      private Long id;
        String simCardNo;
        String mobileNo;
        String status;
        String expiryDate;
        String stateOfRegistration;
        String kyc;
        String telecomProvider;
        String name;

        public SimRecord(String simCardNo, String mobileNo, String status, String expiryDate, String stateOfRegistration, String kyc, String telecomProvider, String name) {
            this.simCardNo = simCardNo;
            this.mobileNo = mobileNo;
            status = status;
            this.expiryDate = expiryDate;
            this.stateOfRegistration = stateOfRegistration;
            this.kyc = kyc;
            this.telecomProvider = telecomProvider;
            this.name = name;
        }

        public String getSimCardNo() {
            return simCardNo;
        }

        public void setSimCardNo(String simCardNo) {
            this.simCardNo = simCardNo;
        }

        public String getMobileNo() {
            return mobileNo;
        }

        public void setMobileNo(String mobileNo) {
            this.mobileNo = mobileNo;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            status = status;
        }

        public String getExpiryDate() {
            return expiryDate;
        }

        public void setExpiryDate(String expiryDate) {
            this.expiryDate = expiryDate;
        }

        public String getStateOfRegistration() {
            return stateOfRegistration;
        }

        public void setStateOfRegistration(String stateOfRegistration) {
            this.stateOfRegistration = stateOfRegistration;
        }

        public String getKyc() {
            return kyc;
        }

        public void setKyc(String kyc) {
            this.kyc = kyc;
        }

        public String getTelecomProvider() {
            return telecomProvider;
        }

        public void setTelecomProvider(String telecomProvider) {
            this.telecomProvider = telecomProvider;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


