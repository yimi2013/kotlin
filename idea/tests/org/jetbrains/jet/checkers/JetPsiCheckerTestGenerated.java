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
package org.jetbrains.jet.checkers;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.checkers.AbstractJetPsiCheckerTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.GenerateTests}. DO NOT MODIFY MANUALLY */
@InnerTestClasses({JetPsiCheckerTestGenerated.Checker.class, JetPsiCheckerTestGenerated.Regression.class, JetPsiCheckerTestGenerated.Rendering.class, JetPsiCheckerTestGenerated.Infos.class})
public class JetPsiCheckerTestGenerated extends AbstractJetPsiCheckerTest {
    @TestMetadata("idea/testData/checker")
    public static class Checker extends AbstractJetPsiCheckerTest {
        @TestMetadata("Abstract.kt")
        public void testAbstract() throws Exception {
            doTest("idea/testData/checker/Abstract.kt");
        }
        
        public void testAllFilesPresentInChecker() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("idea/testData/checker"), "kt", false);
        }
        
        @TestMetadata("AnonymousInitializers.kt")
        public void testAnonymousInitializers() throws Exception {
            doTest("idea/testData/checker/AnonymousInitializers.kt");
        }
        
        @TestMetadata("BinaryCallsOnNullableValues.kt")
        public void testBinaryCallsOnNullableValues() throws Exception {
            doTest("idea/testData/checker/BinaryCallsOnNullableValues.kt");
        }
        
        @TestMetadata("Bounds.kt")
        public void testBounds() throws Exception {
            doTest("idea/testData/checker/Bounds.kt");
        }
        
        @TestMetadata("Bounds2.kt")
        public void testBounds2() throws Exception {
            doTest("idea/testData/checker/Bounds2.kt");
        }
        
        @TestMetadata("BoundsWithSubstitutors.kt")
        public void testBoundsWithSubstitutors() throws Exception {
            doTest("idea/testData/checker/BoundsWithSubstitutors.kt");
        }
        
        @TestMetadata("BreakContinue.kt")
        public void testBreakContinue() throws Exception {
            doTest("idea/testData/checker/BreakContinue.kt");
        }
        
        @TestMetadata("Builders.kt")
        public void testBuilders() throws Exception {
            doTest("idea/testData/checker/Builders.kt");
        }
        
        @TestMetadata("Casts.kt")
        public void testCasts() throws Exception {
            doTest("idea/testData/checker/Casts.kt");
        }
        
        @TestMetadata("ClassObjects.kt")
        public void testClassObjects() throws Exception {
            doTest("idea/testData/checker/ClassObjects.kt");
        }
        
        @TestMetadata("Constants.kt")
        public void testConstants() throws Exception {
            doTest("idea/testData/checker/Constants.kt");
        }
        
        @TestMetadata("Constructors.kt")
        public void testConstructors() throws Exception {
            doTest("idea/testData/checker/Constructors.kt");
        }
        
        @TestMetadata("CyclicHierarchy.kt")
        public void testCyclicHierarchy() throws Exception {
            doTest("idea/testData/checker/CyclicHierarchy.kt");
        }
        
        @TestMetadata("ExtensionFunctions.kt")
        public void testExtensionFunctions() throws Exception {
            doTest("idea/testData/checker/ExtensionFunctions.kt");
        }
        
        @TestMetadata("ForRangeConventions.kt")
        public void testForRangeConventions() throws Exception {
            doTest("idea/testData/checker/ForRangeConventions.kt");
        }
        
        @TestMetadata("FunctionReturnTypes.kt")
        public void testFunctionReturnTypes() throws Exception {
            doTest("idea/testData/checker/FunctionReturnTypes.kt");
        }
        
        @TestMetadata("GenericArgumentConsistency.kt")
        public void testGenericArgumentConsistency() throws Exception {
            doTest("idea/testData/checker/GenericArgumentConsistency.kt");
        }
        
        @TestMetadata("IncDec.kt")
        public void testIncDec() throws Exception {
            doTest("idea/testData/checker/IncDec.kt");
        }
        
        @TestMetadata("IsExpressions.kt")
        public void testIsExpressions() throws Exception {
            doTest("idea/testData/checker/IsExpressions.kt");
        }
        
        @TestMetadata("LocalObjects.kt")
        public void testLocalObjects() throws Exception {
            doTest("idea/testData/checker/LocalObjects.kt");
        }
        
        @TestMetadata("MultipleBounds.kt")
        public void testMultipleBounds() throws Exception {
            doTest("idea/testData/checker/MultipleBounds.kt");
        }
        
        @TestMetadata("NamespaceAsExpression.kt")
        public void testNamespaceAsExpression() throws Exception {
            doTest("idea/testData/checker/NamespaceAsExpression.kt");
        }
        
        @TestMetadata("NamespaceQualified.kt")
        public void testNamespaceQualified() throws Exception {
            doTest("idea/testData/checker/NamespaceQualified.kt");
        }
        
        @TestMetadata("NestedObjects.kt")
        public void testNestedObjects() throws Exception {
            doTest("idea/testData/checker/NestedObjects.kt");
        }
        
        @TestMetadata("NotFinishedGenericDeclaration.kt")
        public void testNotFinishedGenericDeclaration() throws Exception {
            doTest("idea/testData/checker/NotFinishedGenericDeclaration.kt");
        }
        
        @TestMetadata("Nullability.kt")
        public void testNullability() throws Exception {
            doTest("idea/testData/checker/Nullability.kt");
        }
        
        @TestMetadata("Objects.kt")
        public void testObjects() throws Exception {
            doTest("idea/testData/checker/Objects.kt");
        }
        
        @TestMetadata("Override.kt")
        public void testOverride() throws Exception {
            doTest("idea/testData/checker/Override.kt");
        }
        
        @TestMetadata("OverridesAndGenerics.kt")
        public void testOverridesAndGenerics() throws Exception {
            doTest("idea/testData/checker/OverridesAndGenerics.kt");
        }
        
        @TestMetadata("PrimaryConstructors.kt")
        public void testPrimaryConstructors() throws Exception {
            doTest("idea/testData/checker/PrimaryConstructors.kt");
        }
        
        @TestMetadata("ProjectionsInSupertypes.kt")
        public void testProjectionsInSupertypes() throws Exception {
            doTest("idea/testData/checker/ProjectionsInSupertypes.kt");
        }
        
        @TestMetadata("Properties.kt")
        public void testProperties() throws Exception {
            doTest("idea/testData/checker/Properties.kt");
        }
        
        @TestMetadata("QualifiedExpressions.kt")
        public void testQualifiedExpressions() throws Exception {
            doTest("idea/testData/checker/QualifiedExpressions.kt");
        }
        
        @TestMetadata("QualifiedThis.kt")
        public void testQualifiedThis() throws Exception {
            doTest("idea/testData/checker/QualifiedThis.kt");
        }
        
        @TestMetadata("QualifiedThisInClosures.kt")
        public void testQualifiedThisInClosures() throws Exception {
            doTest("idea/testData/checker/QualifiedThisInClosures.kt");
        }
        
        @TestMetadata("RecursiveTypeInference.kt")
        public void testRecursiveTypeInference() throws Exception {
            doTest("idea/testData/checker/RecursiveTypeInference.kt");
        }
        
        @TestMetadata("Redeclarations.kt")
        public void testRedeclarations() throws Exception {
            doTest("idea/testData/checker/Redeclarations.kt");
        }
        
        @TestMetadata("ResolveToJava.kt")
        public void testResolveToJava() throws Exception {
            doTest("idea/testData/checker/ResolveToJava.kt");
        }
        
        @TestMetadata("StringTemplates.kt")
        public void testStringTemplates() throws Exception {
            doTest("idea/testData/checker/StringTemplates.kt");
        }
        
        @TestMetadata("SupertypeListChecks.kt")
        public void testSupertypeListChecks() throws Exception {
            doTest("idea/testData/checker/SupertypeListChecks.kt");
        }
        
        @TestMetadata("TraitSupertypeList.kt")
        public void testTraitSupertypeList() throws Exception {
            doTest("idea/testData/checker/TraitSupertypeList.kt");
        }
        
        @TestMetadata("UnreachableCode.kt")
        public void testUnreachableCode() throws Exception {
            doTest("idea/testData/checker/UnreachableCode.kt");
        }
        
        @TestMetadata("Unresolved.kt")
        public void testUnresolved() throws Exception {
            doTest("idea/testData/checker/Unresolved.kt");
        }
        
        @TestMetadata("Variance.kt")
        public void testVariance() throws Exception {
            doTest("idea/testData/checker/Variance.kt");
        }
        
        @TestMetadata("When.kt")
        public void testWhen() throws Exception {
            doTest("idea/testData/checker/When.kt");
        }
        
    }
    
    @TestMetadata("idea/testData/checker/regression")
    public static class Regression extends AbstractJetPsiCheckerTest {
        public void testAllFilesPresentInRegression() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("idea/testData/checker/regression"), "kt", true);
        }
        
        @TestMetadata("AmbiguityOnLazyTypeComputation.kt")
        public void testAmbiguityOnLazyTypeComputation() throws Exception {
            doTest("idea/testData/checker/regression/AmbiguityOnLazyTypeComputation.kt");
        }
        
        @TestMetadata("AssignmentsUnderOperators.kt")
        public void testAssignmentsUnderOperators() throws Exception {
            doTest("idea/testData/checker/regression/AssignmentsUnderOperators.kt");
        }
        
        @TestMetadata("CoercionToUnit.kt")
        public void testCoercionToUnit() throws Exception {
            doTest("idea/testData/checker/regression/CoercionToUnit.kt");
        }
        
        @TestMetadata("DoubleDefine.kt")
        public void testDoubleDefine() throws Exception {
            doTest("idea/testData/checker/regression/DoubleDefine.kt");
        }
        
        @TestMetadata("Jet11.kt")
        public void testJet11() throws Exception {
            doTest("idea/testData/checker/regression/Jet11.kt");
        }
        
        @TestMetadata("Jet121.kt")
        public void testJet121() throws Exception {
            doTest("idea/testData/checker/regression/Jet121.kt");
        }
        
        @TestMetadata("Jet124.kt")
        public void testJet124() throws Exception {
            doTest("idea/testData/checker/regression/Jet124.kt");
        }
        
        @TestMetadata("Jet169.kt")
        public void testJet169() throws Exception {
            doTest("idea/testData/checker/regression/Jet169.kt");
        }
        
        @TestMetadata("Jet17.kt")
        public void testJet17() throws Exception {
            doTest("idea/testData/checker/regression/Jet17.kt");
        }
        
        @TestMetadata("Jet183.kt")
        public void testJet183() throws Exception {
            doTest("idea/testData/checker/regression/Jet183.kt");
        }
        
        @TestMetadata("Jet183-1.kt")
        public void testJet183_1() throws Exception {
            doTest("idea/testData/checker/regression/Jet183-1.kt");
        }
        
        @TestMetadata("Jet53.kt")
        public void testJet53() throws Exception {
            doTest("idea/testData/checker/regression/Jet53.kt");
        }
        
        @TestMetadata("Jet67.kt")
        public void testJet67() throws Exception {
            doTest("idea/testData/checker/regression/Jet67.kt");
        }
        
        @TestMetadata("Jet68.kt")
        public void testJet68() throws Exception {
            doTest("idea/testData/checker/regression/Jet68.kt");
        }
        
        @TestMetadata("Jet69.kt")
        public void testJet69() throws Exception {
            doTest("idea/testData/checker/regression/Jet69.kt");
        }
        
        @TestMetadata("Jet72.kt")
        public void testJet72() throws Exception {
            doTest("idea/testData/checker/regression/Jet72.kt");
        }
        
        @TestMetadata("Jet81.kt")
        public void testJet81() throws Exception {
            doTest("idea/testData/checker/regression/Jet81.kt");
        }
        
        @TestMetadata("kt251.kt")
        public void testKt251() throws Exception {
            doTest("idea/testData/checker/regression/kt251.kt");
        }
        
        @TestMetadata("kt303.kt")
        public void testKt303() throws Exception {
            doTest("idea/testData/checker/regression/kt303.kt");
        }
        
        @TestMetadata("OverrideResolution.kt")
        public void testOverrideResolution() throws Exception {
            doTest("idea/testData/checker/regression/OverrideResolution.kt");
        }
        
        @TestMetadata("ScopeForSecondaryConstructors.kt")
        public void testScopeForSecondaryConstructors() throws Exception {
            doTest("idea/testData/checker/regression/ScopeForSecondaryConstructors.kt");
        }
        
        @TestMetadata("SpecififcityByReceiver.kt")
        public void testSpecififcityByReceiver() throws Exception {
            doTest("idea/testData/checker/regression/SpecififcityByReceiver.kt");
        }
        
        @TestMetadata("WrongTraceInCallResolver.kt")
        public void testWrongTraceInCallResolver() throws Exception {
            doTest("idea/testData/checker/regression/WrongTraceInCallResolver.kt");
        }
        
    }
    
    @TestMetadata("idea/testData/checker/rendering")
    public static class Rendering extends AbstractJetPsiCheckerTest {
        public void testAllFilesPresentInRendering() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("idea/testData/checker/rendering"), "kt", true);
        }
        
        @TestMetadata("TypeInferenceError.kt")
        public void testTypeInferenceError() throws Exception {
            doTest("idea/testData/checker/rendering/TypeInferenceError.kt");
        }
        
    }
    
    @TestMetadata("idea/testData/checker/infos")
    public static class Infos extends AbstractJetPsiCheckerTest {
        public void testAllFilesPresentInInfos() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("idea/testData/checker/infos"), "kt", true);
        }
        
        @TestMetadata("Autocasts.kt")
        public void testAutocasts() throws Exception {
            doTest("idea/testData/checker/infos/Autocasts.kt");
        }
        
        @TestMetadata("PropertiesWithBackingFields.kt")
        public void testPropertiesWithBackingFields() throws Exception {
            doTest("idea/testData/checker/infos/PropertiesWithBackingFields.kt");
        }
        
        @TestMetadata("WrapIntoRef.kt")
        public void testWrapIntoRef() throws Exception {
            doTest("idea/testData/checker/infos/WrapIntoRef.kt");
        }
        
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("JetPsiCheckerTestGenerated");
        suite.addTestSuite(Checker.class);
        suite.addTestSuite(Regression.class);
        suite.addTestSuite(Rendering.class);
        suite.addTestSuite(Infos.class);
        return suite;
    }
}
