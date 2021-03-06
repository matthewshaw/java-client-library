/*
 * ProjectAdoptionOptions.java
 *
 * Copyright (C) 2010-2014 by Revolution Analytics Inc.
 *
 * This program is licensed to you under the terms of Version 2.0 of the
 * Apache License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * Apache License 2.0 (http://www.apache.org/licenses/LICENSE-2.0) for more details.
 *
 */
package com.revo.deployr.client.params;

import java.util.Map;

/**
 * Project pre-execution project adoption options.
 */
public class ProjectAdoptionOptions {

    public ProjectAdoptionOptions() {
    }

    /**
     * Adopt project workspace.
     */
    public String adoptWorkspace;

    /**
     * Adopt project directory.
     */
    public String adoptDirectory;

    /**
     * Adopt project packages.
     */
    public String adoptPackages;

}
