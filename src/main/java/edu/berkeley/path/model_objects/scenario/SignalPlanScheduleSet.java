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

public class SignalPlanScheduleSet extends edu.berkeley.path.model_objects.jaxb.SignalPlanScheduleSet {
    public List<SignalPlanSchedule> getListOfSignalPlanSchedules() {
        return (List<SignalPlanSchedule>)(List<?>) super.getSignalPlanSchedule();
    }

    public void setListOfSignalPlanSchedules(List<SignalPlanSchedule> schedules) {
        getListOfSignalPlanSchedules().clear();
        getListOfSignalPlanSchedules().addAll(schedules);
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
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public void setDescription(String value) {
        super.setDescription(value);
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
    public long getPlanSetId() {
        return super.getPlanSetId();
    }

    @Override
    public void setPlanSetId(long value) {
        super.setPlanSetId(value);
    }

    /**
     * Override Jaxb getters for children to manage Json serialization
     */
    @Override
    @JsonIgnore
    public List<edu.berkeley.path.model_objects.jaxb.SignalPlanSchedule> getSignalPlanSchedule() {
        if (signalPlanSchedule == null) {
            signalPlanSchedule = new ArrayList<edu.berkeley.path.model_objects.jaxb.SignalPlanSchedule>();
        }
        return this.signalPlanSchedule;
    }
}
