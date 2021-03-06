package br.pucrio.dslmetrics.core.domain.metrics;

import br.pucrio.dslmetrics.core.domain.Entity;
import br.pucrio.dslmetrics.core.mtbl.CalculatedMetric;

/**
 *  quantidade de alterações (ou instabilidade) de uma dada propriedade ao longo das versões dividido pelo tempo de vida da entidade
 * @author leandra
 *
 */
public class RelativeNumberOfChange extends ChangeHistorySensitiveMetric {

	private static final String GENERAL_NAME = "Relative Number of Change";
	private final String GENERAL_NICKNAME = "rnc";
	private int numberOfChanges;
	private int timelife;

	public RelativeNumberOfChange(CalculatedMetric conventionalMetric) {
		super(conventionalMetric);
	}

	@Override
	protected void onNewEntity(Entity entity) {
		timelife = 0;
		numberOfChanges = 0;
	}

	protected Double calculateMetricValueForOneVersion(Double firstMetricValue,
			Double previousMetricValue, Double currentMetricValue) {
		//alterei hoje: 14/04
		//timelife++;
		
		if(timelife == 0){
			timelife++;
			return null;
		}
			

		if (currentMetricValue == null || previousMetricValue == null)
			return null;

		if (!currentMetricValue.equals(previousMetricValue))
			numberOfChanges++;
		
		double returnValue = (double) numberOfChanges / (double) timelife;
		
		//alterei hoje: 14/04
		timelife++;

		//return (double) numberOfChanges / (double) timelife;
		return returnValue;

	}

	@Override
	public String getGeneralName() {
		return GENERAL_NAME;
	}

	@Override
	public String getGeneralNickname() {
		return GENERAL_NICKNAME;
	}

}
