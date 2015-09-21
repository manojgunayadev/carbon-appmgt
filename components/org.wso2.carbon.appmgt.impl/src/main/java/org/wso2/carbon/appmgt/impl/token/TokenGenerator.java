/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.appmgt.impl.token;

import org.apache.synapse.MessageContext;
import org.wso2.carbon.appmgt.api.AppManagementException;
import org.wso2.carbon.appmgt.impl.dto.WebAppInfoDTO;

import java.util.Map;

/**
 * This interface can be used to Generate a Token with the invoking user's details.
 */
public interface TokenGenerator {
    public String generateToken(Map<String, Object> saml2Assertions, WebAppInfoDTO webAppInfoDTO,
                                MessageContext messageContext)
            throws AppManagementException;
}