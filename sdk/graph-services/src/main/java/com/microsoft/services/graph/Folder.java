/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/
package com.microsoft.services.graph;



/**
 * The type Folder.
*/
public class Folder extends Item {

    public Folder(){
        setODataType("#Microsoft.Graph.Folder");
    }
            
    private Integer childCount;
     
    /**
    * Gets the child Count.
    *
    * @return the Integer
    */
    public Integer getChildCount() {
        return this.childCount; 
    }

    /**
    * Sets the child Count.
    *
    * @param value the Integer
    */
    public void setChildCount(Integer value) { 
        this.childCount = value; 
        valueChanged("childCount", value);

    }
}

