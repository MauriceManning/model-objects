/*
 * Copyright (c) 2014, Regents of the University of California
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package edu.berkeley.path.model_objects.scenario;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class SignalPlanSchedule extends edu.berkeley.path.model_objects.jaxb.SignalPlanSchedule {
    public List<SignalPlanScheduleElement> getListOfSignalPlanScheduleElements() {
        return (List<SignalPlanScheduleElement>)(List<?>) super.getSignalPlanScheduleElement();
    }

    public void setListOfSignalPlanScheduleElements(List<SignalPlanScheduleElement> elements) {
        getListOfSignalPlanScheduleElements().clear();
        getListOfSignalPlanScheduleElements().addAll(elements);
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public void setId(long value) {
        super.setId(value);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String value) {
        super.setName(value);
    }

    @Override
    public String getModStamp() {
        return super.getModStamp();
    }

    @Override
    public void setModStamp(String value) {
        super.setModStamp(value);
    }

    @Override
    public String getCrudFlag() {
        return super.getCrudFlag();
    }

    @Override
    public void setCrudFlag(String value) {
        super.setCrudFlag(value);
    }

    @Override
    public long getScheduleSetId() {
        return super.getScheduleSetId();
    }

    @Override
    public void setScheduleSetId(long value) {
        super.setScheduleSetId(value);
    }

    @Override
    public long getTableNum() {
        return super.getTableNum();
    }

    @Override
    public void setTableNum(long value) {
        super.setTableNum(value);
    }

    /**
     * Override Jaxb getters for children to manage Json serialization
     */
    @Override
    @JsonIgnore
    public List<edu.berkeley.path.model_objects.jaxb.SignalPlanScheduleElement> getSignalPlanScheduleElement() {
        if (signalPlanScheduleElement == null) {
            signalPlanScheduleElement = new ArrayList<edu.berkeley.path.model_objects.jaxb.SignalPlanScheduleElement>();
        }
        return this.signalPlanScheduleElement;
    }
}
