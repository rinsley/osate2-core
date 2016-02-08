/*
 * generated by Xtext
 */
package org.osate.xtext.aadl2.instance.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.osate.xtext.aadl2.instance.services.InstanceGrammarAccess;

public class InstanceParser extends AbstractContentAssistParser {
	
	@Inject
	private InstanceGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.osate.xtext.aadl2.instance.ui.contentassist.antlr.internal.InternalInstanceParser createParser() {
		org.osate.xtext.aadl2.instance.ui.contentassist.antlr.internal.InternalInstanceParser result = new org.osate.xtext.aadl2.instance.ui.contentassist.antlr.internal.InternalInstanceParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getComponentCategoryAccess().getAlternatives(), "rule__ComponentCategory__Alternatives");
					put(grammarAccess.getFeatureCategoryAccess().getAlternatives(), "rule__FeatureCategory__Alternatives");
					put(grammarAccess.getDirectionTypeAccess().getAlternatives(), "rule__DirectionType__Alternatives");
					put(grammarAccess.getConnectionKindAccess().getAlternatives(), "rule__ConnectionKind__Alternatives");
					put(grammarAccess.getSystemInstanceAccess().getGroup(), "rule__SystemInstance__Group__0");
					put(grammarAccess.getComponentInstanceAccess().getGroup(), "rule__ComponentInstance__Group__0");
					put(grammarAccess.getComponentInstanceAccess().getGroup_3(), "rule__ComponentInstance__Group_3__0");
					put(grammarAccess.getComponentInstanceAccess().getGroup_13(), "rule__ComponentInstance__Group_13__0");
					put(grammarAccess.getFeatureInstanceAccess().getGroup(), "rule__FeatureInstance__Group__0");
					put(grammarAccess.getFeatureInstanceAccess().getGroup_3(), "rule__FeatureInstance__Group_3__0");
					put(grammarAccess.getModeInstanceAccess().getGroup(), "rule__ModeInstance__Group__0");
					put(grammarAccess.getModeTransitionInstanceAccess().getGroup(), "rule__ModeTransitionInstance__Group__0");
					put(grammarAccess.getFlowSpecInstanceAccess().getGroup(), "rule__FlowSpecInstance__Group__0");
					put(grammarAccess.getFlowSpecInstanceAccess().getGroup_5(), "rule__FlowSpecInstance__Group_5__0");
					put(grammarAccess.getFlowSpecInstanceAccess().getGroup_6(), "rule__FlowSpecInstance__Group_6__0");
					put(grammarAccess.getFlowSpecInstanceAccess().getGroup_7(), "rule__FlowSpecInstance__Group_7__0");
					put(grammarAccess.getFlowSpecInstanceAccess().getGroup_8(), "rule__FlowSpecInstance__Group_8__0");
					put(grammarAccess.getEndToEndFlowInstanceAccess().getGroup(), "rule__EndToEndFlowInstance__Group__0");
					put(grammarAccess.getEndToEndFlowInstanceAccess().getGroup_6(), "rule__EndToEndFlowInstance__Group_6__0");
					put(grammarAccess.getEndToEndFlowInstanceAccess().getGroup_7(), "rule__EndToEndFlowInstance__Group_7__0");
					put(grammarAccess.getSystemOperationModeAccess().getGroup(), "rule__SystemOperationMode__Group__0");
					put(grammarAccess.getConnectionInstanceAccess().getGroup(), "rule__ConnectionInstance__Group__0");
					put(grammarAccess.getConnectionInstanceAccess().getGroup_9(), "rule__ConnectionInstance__Group_9__0");
					put(grammarAccess.getConnectionInstanceAccess().getGroup_10(), "rule__ConnectionInstance__Group_10__0");
					put(grammarAccess.getConnectionReferenceAccess().getGroup(), "rule__ConnectionReference__Group__0");
					put(grammarAccess.getComponentCategoryAccess().getGroup_8(), "rule__ComponentCategory__Group_8__0");
					put(grammarAccess.getComponentCategoryAccess().getGroup_10(), "rule__ComponentCategory__Group_10__0");
					put(grammarAccess.getComponentCategoryAccess().getGroup_12(), "rule__ComponentCategory__Group_12__0");
					put(grammarAccess.getComponentCategoryAccess().getGroup_13(), "rule__ComponentCategory__Group_13__0");
					put(grammarAccess.getFQCREFAccess().getGroup(), "rule__FQCREF__Group__0");
					put(grammarAccess.getFQCREFAccess().getGroup_0(), "rule__FQCREF__Group_0__0");
					put(grammarAccess.getFQCREFAccess().getGroup_2(), "rule__FQCREF__Group_2__0");
					put(grammarAccess.getINSTANCEREFAccess().getGroup(), "rule__INSTANCEREF__Group__0");
					put(grammarAccess.getINSTANCEREFAccess().getGroup_0(), "rule__INSTANCEREF__Group_0__0");
					put(grammarAccess.getSOMIDAccess().getGroup(), "rule__SOMID__Group__0");
					put(grammarAccess.getSOMIDAccess().getGroup_0(), "rule__SOMID__Group_0__0");
					put(grammarAccess.getSystemInstanceAccess().getCategoryAssignment_0(), "rule__SystemInstance__CategoryAssignment_0");
					put(grammarAccess.getSystemInstanceAccess().getNameAssignment_1(), "rule__SystemInstance__NameAssignment_1");
					put(grammarAccess.getSystemInstanceAccess().getComponentImplementationAssignment_3(), "rule__SystemInstance__ComponentImplementationAssignment_3");
					put(grammarAccess.getSystemInstanceAccess().getSystemOperationModeAssignment_5(), "rule__SystemInstance__SystemOperationModeAssignment_5");
					put(grammarAccess.getComponentInstanceAccess().getCategoryAssignment_0(), "rule__ComponentInstance__CategoryAssignment_0");
					put(grammarAccess.getComponentInstanceAccess().getNameAssignment_2(), "rule__ComponentInstance__NameAssignment_2");
					put(grammarAccess.getComponentInstanceAccess().getIndexAssignment_3_1(), "rule__ComponentInstance__IndexAssignment_3_1");
					put(grammarAccess.getComponentInstanceAccess().getSubcomponentAssignment_5(), "rule__ComponentInstance__SubcomponentAssignment_5");
					put(grammarAccess.getComponentInstanceAccess().getFeatureInstanceAssignment_6(), "rule__ComponentInstance__FeatureInstanceAssignment_6");
					put(grammarAccess.getComponentInstanceAccess().getComponentInstanceAssignment_7(), "rule__ComponentInstance__ComponentInstanceAssignment_7");
					put(grammarAccess.getComponentInstanceAccess().getModeInstanceAssignment_8(), "rule__ComponentInstance__ModeInstanceAssignment_8");
					put(grammarAccess.getComponentInstanceAccess().getModeTransitionInstanceAssignment_9(), "rule__ComponentInstance__ModeTransitionInstanceAssignment_9");
					put(grammarAccess.getComponentInstanceAccess().getFlowSpecificationAssignment_10(), "rule__ComponentInstance__FlowSpecificationAssignment_10");
					put(grammarAccess.getComponentInstanceAccess().getEndToEndFlowAssignment_11(), "rule__ComponentInstance__EndToEndFlowAssignment_11");
					put(grammarAccess.getComponentInstanceAccess().getConnectionInstanceAssignment_12(), "rule__ComponentInstance__ConnectionInstanceAssignment_12");
					put(grammarAccess.getComponentInstanceAccess().getInModeAssignment_13_2(), "rule__ComponentInstance__InModeAssignment_13_2");
					put(grammarAccess.getFeatureInstanceAccess().getCategoryAssignment_0(), "rule__FeatureInstance__CategoryAssignment_0");
					put(grammarAccess.getFeatureInstanceAccess().getNameAssignment_2(), "rule__FeatureInstance__NameAssignment_2");
					put(grammarAccess.getFeatureInstanceAccess().getIndexAssignment_3_1(), "rule__FeatureInstance__IndexAssignment_3_1");
					put(grammarAccess.getFeatureInstanceAccess().getFeatureAssignment_5(), "rule__FeatureInstance__FeatureAssignment_5");
					put(grammarAccess.getFeatureInstanceAccess().getDirectionAssignment_6(), "rule__FeatureInstance__DirectionAssignment_6");
					put(grammarAccess.getFeatureInstanceAccess().getFeatureInstanceAssignment_7(), "rule__FeatureInstance__FeatureInstanceAssignment_7");
					put(grammarAccess.getModeInstanceAccess().getNameAssignment_2(), "rule__ModeInstance__NameAssignment_2");
					put(grammarAccess.getModeInstanceAccess().getModeAssignment_4(), "rule__ModeInstance__ModeAssignment_4");
					put(grammarAccess.getModeInstanceAccess().getInitialAssignment_5(), "rule__ModeInstance__InitialAssignment_5");
					put(grammarAccess.getModeTransitionInstanceAccess().getNameAssignment_3(), "rule__ModeTransitionInstance__NameAssignment_3");
					put(grammarAccess.getModeTransitionInstanceAccess().getModeTransitionAssignment_5(), "rule__ModeTransitionInstance__ModeTransitionAssignment_5");
					put(grammarAccess.getModeTransitionInstanceAccess().getSourceAssignment_7(), "rule__ModeTransitionInstance__SourceAssignment_7");
					put(grammarAccess.getModeTransitionInstanceAccess().getDestinationAssignment_9(), "rule__ModeTransitionInstance__DestinationAssignment_9");
					put(grammarAccess.getFlowSpecInstanceAccess().getNameAssignment_2(), "rule__FlowSpecInstance__NameAssignment_2");
					put(grammarAccess.getFlowSpecInstanceAccess().getFlowSpecificationAssignment_4(), "rule__FlowSpecInstance__FlowSpecificationAssignment_4");
					put(grammarAccess.getFlowSpecInstanceAccess().getSourceAssignment_5_1(), "rule__FlowSpecInstance__SourceAssignment_5_1");
					put(grammarAccess.getFlowSpecInstanceAccess().getDestinationAssignment_6_1(), "rule__FlowSpecInstance__DestinationAssignment_6_1");
					put(grammarAccess.getFlowSpecInstanceAccess().getInModeAssignment_7_2(), "rule__FlowSpecInstance__InModeAssignment_7_2");
					put(grammarAccess.getFlowSpecInstanceAccess().getInModeTransitionAssignment_8_2(), "rule__FlowSpecInstance__InModeTransitionAssignment_8_2");
					put(grammarAccess.getEndToEndFlowInstanceAccess().getNameAssignment_2(), "rule__EndToEndFlowInstance__NameAssignment_2");
					put(grammarAccess.getEndToEndFlowInstanceAccess().getEndToEndFlowAssignment_4(), "rule__EndToEndFlowInstance__EndToEndFlowAssignment_4");
					put(grammarAccess.getEndToEndFlowInstanceAccess().getFlowElementAssignment_5(), "rule__EndToEndFlowInstance__FlowElementAssignment_5");
					put(grammarAccess.getEndToEndFlowInstanceAccess().getInModeAssignment_6_2(), "rule__EndToEndFlowInstance__InModeAssignment_6_2");
					put(grammarAccess.getEndToEndFlowInstanceAccess().getInSystemOperationModeAssignment_7_2(), "rule__EndToEndFlowInstance__InSystemOperationModeAssignment_7_2");
					put(grammarAccess.getSystemOperationModeAccess().getNameAssignment_1(), "rule__SystemOperationMode__NameAssignment_1");
					put(grammarAccess.getConnectionInstanceAccess().getKindAssignment_0(), "rule__ConnectionInstance__KindAssignment_0");
					put(grammarAccess.getConnectionInstanceAccess().getConnectionReferenceAssignment_4(), "rule__ConnectionInstance__ConnectionReferenceAssignment_4");
					put(grammarAccess.getConnectionInstanceAccess().getSourceAssignment_6(), "rule__ConnectionInstance__SourceAssignment_6");
					put(grammarAccess.getConnectionInstanceAccess().getDestinationAssignment_8(), "rule__ConnectionInstance__DestinationAssignment_8");
					put(grammarAccess.getConnectionInstanceAccess().getInSystemOperationModeAssignment_9_2(), "rule__ConnectionInstance__InSystemOperationModeAssignment_9_2");
					put(grammarAccess.getConnectionInstanceAccess().getInModeTransitionAssignment_10_2(), "rule__ConnectionInstance__InModeTransitionAssignment_10_2");
					put(grammarAccess.getConnectionInstanceAccess().getCompleteAssignment_11(), "rule__ConnectionInstance__CompleteAssignment_11");
					put(grammarAccess.getConnectionInstanceAccess().getBidirectionalAssignment_12(), "rule__ConnectionInstance__BidirectionalAssignment_12");
					put(grammarAccess.getConnectionReferenceAccess().getConnectionAssignment_1(), "rule__ConnectionReference__ConnectionAssignment_1");
					put(grammarAccess.getConnectionReferenceAccess().getSourceAssignment_3(), "rule__ConnectionReference__SourceAssignment_3");
					put(grammarAccess.getConnectionReferenceAccess().getDestinationAssignment_5(), "rule__ConnectionReference__DestinationAssignment_5");
					put(grammarAccess.getConnectionReferenceAccess().getContextAssignment_7(), "rule__ConnectionReference__ContextAssignment_7");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.osate.xtext.aadl2.instance.ui.contentassist.antlr.internal.InternalInstanceParser typedParser = (org.osate.xtext.aadl2.instance.ui.contentassist.antlr.internal.InternalInstanceParser) parser;
			typedParser.entryRuleSystemInstance();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_SL_COMMENT" };
	}
	
	public InstanceGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(InstanceGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
