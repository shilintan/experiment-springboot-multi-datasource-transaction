/*
 *  Copyright 1999-2021 Seata.io Group.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package io.seata.samples.account.service;

import io.seata.samples.account.persistence.account.Account;
import io.seata.samples.account.persistence.account.AccountMapper;
import io.seata.samples.account.persistence.order.Order;
import io.seata.samples.account.persistence.order.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private AccountMapper accountMapper;

//    @Transactional
    public void update() {
        Account account = new Account();
        account.setId(1);
        account.setMoney(new BigDecimal(2));
        accountMapper.updateById(account);

        Order order = new Order();
        order.setId(1);
        order.setMoney(new BigDecimal(1));

        orderMapper.updateById(order);
        throw new RuntimeException("exception");
    }
}
