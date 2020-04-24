package com.gjb.springcloud.service.impl;


import com.gjb.springcloud.dao.PaymentDao;
import com.gjb.springcloud.entities.Payment;
import com.gjb.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return  paymentDao.getPaymentById(id);
    }
}
