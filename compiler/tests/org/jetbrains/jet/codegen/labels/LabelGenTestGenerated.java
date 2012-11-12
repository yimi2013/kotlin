/*
 * Copyright 2010-2012 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jetbrains.jet.codegen.labels;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.codegen.labels.AbstractLabelGenTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.GenerateTests}. DO NOT MODIFY MANUALLY */
@TestMetadata("compiler/testData/codegen/label")
public class LabelGenTestGenerated extends AbstractLabelGenTest {
    public void testAllFilesPresentInLabel() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/codegen/label"), "kt", true);
    }
    
    @TestMetadata("propertyAccessor.kt")
    public void testPropertyAccessor() throws Exception {
        doTest("compiler/testData/codegen/label/propertyAccessor.kt");
    }
    
    @TestMetadata("propertyAccessorFunctionLiteral.kt")
    public void testPropertyAccessorFunctionLiteral() throws Exception {
        doTest("compiler/testData/codegen/label/propertyAccessorFunctionLiteral.kt");
    }
    
    @TestMetadata("propertyAccessorInnerExtensionFun.kt")
    public void testPropertyAccessorInnerExtensionFun() throws Exception {
        doTest("compiler/testData/codegen/label/propertyAccessorInnerExtensionFun.kt");
    }
    
    @TestMetadata("propertyAccessorObject.kt")
    public void testPropertyAccessorObject() throws Exception {
        doTest("compiler/testData/codegen/label/propertyAccessorObject.kt");
    }
    
    @TestMetadata("propertyInClassAccessor.kt")
    public void testPropertyInClassAccessor() throws Exception {
        doTest("compiler/testData/codegen/label/propertyInClassAccessor.kt");
    }
    
}
