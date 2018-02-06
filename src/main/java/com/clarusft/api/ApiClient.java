package com.clarusft.api;

import javax.annotation.Generated;

import com.clarusft.api.exception.ApiException;

@ThreadSafe
@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ApiClient extends ApiClientSupport {

	public ApiClient(ApiClientBuilder builder) {
		super(builder);
	}

	public com.clarusft.api.model.margin.VMBufferResponse request(com.clarusft.api.model.margin.VMBufferRequest request) throws ApiException {
		com.clarusft.api.transform.margin.VMBufferResponseParser parser = new com.clarusft.api.transform.margin.VMBufferResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.frtb.IMAResponse request(com.clarusft.api.model.frtb.IMARequest request) throws ApiException {
		com.clarusft.api.transform.frtb.IMAResponseParser parser = new com.clarusft.api.transform.frtb.IMAResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.margin.AttributionResponse request(com.clarusft.api.model.margin.AttributionRequest request) throws ApiException {
		com.clarusft.api.transform.margin.AttributionResponseParser parser = new com.clarusft.api.transform.margin.AttributionResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.util.TickersResponse request(com.clarusft.api.model.util.TickersRequest request) throws ApiException {
		com.clarusft.api.transform.util.TickersResponseParser parser = new com.clarusft.api.transform.util.TickersResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.hedge.EquivalentsResponse request(com.clarusft.api.model.hedge.EquivalentsRequest request) throws ApiException {
		com.clarusft.api.transform.hedge.EquivalentsResponseParser parser = new com.clarusft.api.transform.hedge.EquivalentsResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.risk.FXVegaResponse request(com.clarusft.api.model.risk.FXVegaRequest request) throws ApiException {
		com.clarusft.api.transform.risk.FXVegaResponseParser parser = new com.clarusft.api.transform.risk.FXVegaResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.dates.IrdSpotDateResponse request(com.clarusft.api.model.dates.IrdSpotDateRequest request) throws ApiException {
		com.clarusft.api.transform.dates.IrdSpotDateResponseParser parser = new com.clarusft.api.transform.dates.IrdSpotDateResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.xva.FVAResponse request(com.clarusft.api.model.xva.FVARequest request) throws ApiException {
		com.clarusft.api.transform.xva.FVAResponseParser parser = new com.clarusft.api.transform.xva.FVAResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.xva.MVAAttributionResponse request(com.clarusft.api.model.xva.MVAAttributionRequest request) throws ApiException {
		com.clarusft.api.transform.xva.MVAAttributionResponseParser parser = new com.clarusft.api.transform.xva.MVAAttributionResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.market.CurveUsageResponse request(com.clarusft.api.model.market.CurveUsageRequest request) throws ApiException {
		com.clarusft.api.transform.market.CurveUsageResponseParser parser = new com.clarusft.api.transform.market.CurveUsageResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.simm.SensitivityResponse request(com.clarusft.api.model.simm.SensitivityRequest request) throws ApiException {
		com.clarusft.api.transform.simm.SensitivityResponseParser parser = new com.clarusft.api.transform.simm.SensitivityResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.util.ActivityResponse request(com.clarusft.api.model.util.ActivityRequest request) throws ApiException {
		com.clarusft.api.transform.util.ActivityResponseParser parser = new com.clarusft.api.transform.util.ActivityResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.market.ParDV01Response request(com.clarusft.api.model.market.ParDV01Request request) throws ApiException {
		com.clarusft.api.transform.market.ParDV01ResponseParser parser = new com.clarusft.api.transform.market.ParDV01ResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.profitloss.PredictResponse request(com.clarusft.api.model.profitloss.PredictRequest request) throws ApiException {
		com.clarusft.api.transform.profitloss.PredictResponseParser parser = new com.clarusft.api.transform.profitloss.PredictResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.dates.FxForwardDateResponse request(com.clarusft.api.model.dates.FxForwardDateRequest request) throws ApiException {
		com.clarusft.api.transform.dates.FxForwardDateResponseParser parser = new com.clarusft.api.transform.dates.FxForwardDateResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.ccp.DefaultResourcesResponse request(com.clarusft.api.model.ccp.DefaultResourcesRequest request) throws ApiException {
		com.clarusft.api.transform.ccp.DefaultResourcesResponseParser parser = new com.clarusft.api.transform.ccp.DefaultResourcesResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.frtb.SAResponse request(com.clarusft.api.model.frtb.SARequest request) throws ApiException {
		com.clarusft.api.transform.frtb.SAResponseParser parser = new com.clarusft.api.transform.frtb.SAResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.compliance.SEFMandatoryResponse request(com.clarusft.api.model.compliance.SEFMandatoryRequest request) throws ApiException {
		com.clarusft.api.transform.compliance.SEFMandatoryResponseParser parser = new com.clarusft.api.transform.compliance.SEFMandatoryResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.risk.VaRVectorsResponse request(com.clarusft.api.model.risk.VaRVectorsRequest request) throws ApiException {
		com.clarusft.api.transform.risk.VaRVectorsResponseParser parser = new com.clarusft.api.transform.risk.VaRVectorsResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.sdr.TradeFilterResponse request(com.clarusft.api.model.sdr.TradeFilterRequest request) throws ApiException {
		com.clarusft.api.transform.sdr.TradeFilterResponseParser parser = new com.clarusft.api.transform.sdr.TradeFilterResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.sdr.TradesResponse request(com.clarusft.api.model.sdr.TradesRequest request) throws ApiException {
		com.clarusft.api.transform.sdr.TradesResponseParser parser = new com.clarusft.api.transform.sdr.TradesResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.margin.VMLSOCResponse request(com.clarusft.api.model.margin.VMLSOCRequest request) throws ApiException {
		com.clarusft.api.transform.margin.VMLSOCResponseParser parser = new com.clarusft.api.transform.margin.VMLSOCResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.margin.SensitivityResponse request(com.clarusft.api.model.margin.SensitivityRequest request) throws ApiException {
		com.clarusft.api.transform.margin.SensitivityResponseParser parser = new com.clarusft.api.transform.margin.SensitivityResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.market.FXRatesResponse request(com.clarusft.api.model.market.FXRatesRequest request) throws ApiException {
		com.clarusft.api.transform.market.FXRatesResponseParser parser = new com.clarusft.api.transform.market.FXRatesResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.frtb.SAImpactResponse request(com.clarusft.api.model.frtb.SAImpactRequest request) throws ApiException {
		com.clarusft.api.transform.frtb.SAImpactResponseParser parser = new com.clarusft.api.transform.frtb.SAImpactResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.load.ScenarioResponse request(com.clarusft.api.model.load.ScenarioRequest request) throws ApiException {
		com.clarusft.api.transform.load.ScenarioResponseParser parser = new com.clarusft.api.transform.load.ScenarioResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.portfolio.SummaryResponse request(com.clarusft.api.model.portfolio.SummaryRequest request) throws ApiException {
		com.clarusft.api.transform.portfolio.SummaryResponseParser parser = new com.clarusft.api.transform.portfolio.SummaryResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.dates.FixingDatesResponse request(com.clarusft.api.model.dates.FixingDatesRequest request) throws ApiException {
		com.clarusft.api.transform.dates.FixingDatesResponseParser parser = new com.clarusft.api.transform.dates.FixingDatesResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.dates.FxOptionDateResponse request(com.clarusft.api.model.dates.FxOptionDateRequest request) throws ApiException {
		com.clarusft.api.transform.dates.FxOptionDateResponseParser parser = new com.clarusft.api.transform.dates.FxOptionDateResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.dates.ScheduleResponse request(com.clarusft.api.model.dates.ScheduleRequest request) throws ApiException {
		com.clarusft.api.transform.dates.ScheduleResponseParser parser = new com.clarusft.api.transform.dates.ScheduleResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.margin.PLVectorsResponse request(com.clarusft.api.model.margin.PLVectorsRequest request) throws ApiException {
		com.clarusft.api.transform.margin.PLVectorsResponseParser parser = new com.clarusft.api.transform.margin.PLVectorsResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.trade.PriceResponse request(com.clarusft.api.model.trade.PriceRequest request) throws ApiException {
		com.clarusft.api.transform.trade.PriceResponseParser parser = new com.clarusft.api.transform.trade.PriceResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.margin.IMResponse request(com.clarusft.api.model.margin.IMRequest request) throws ApiException {
		com.clarusft.api.transform.margin.IMResponseParser parser = new com.clarusft.api.transform.margin.IMResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.risk.StressResponse request(com.clarusft.api.model.risk.StressRequest request) throws ApiException {
		com.clarusft.api.transform.risk.StressResponseParser parser = new com.clarusft.api.transform.risk.StressResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.frtb.PLVectorsResponse request(com.clarusft.api.model.frtb.PLVectorsRequest request) throws ApiException {
		com.clarusft.api.transform.frtb.PLVectorsResponseParser parser = new com.clarusft.api.transform.frtb.PLVectorsResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.market.ParRatesResponse request(com.clarusft.api.model.market.ParRatesRequest request) throws ApiException {
		com.clarusft.api.transform.market.ParRatesResponseParser parser = new com.clarusft.api.transform.market.ParRatesResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.portfolio.TradesResponse request(com.clarusft.api.model.portfolio.TradesRequest request) throws ApiException {
		com.clarusft.api.transform.portfolio.TradesResponseParser parser = new com.clarusft.api.transform.portfolio.TradesResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.frtb.ModellableRFResponse request(com.clarusft.api.model.frtb.ModellableRFRequest request) throws ApiException {
		com.clarusft.api.transform.frtb.ModellableRFResponseParser parser = new com.clarusft.api.transform.frtb.ModellableRFResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.dates.MaintenancePeriodsResponse request(com.clarusft.api.model.dates.MaintenancePeriodsRequest request) throws ApiException {
		com.clarusft.api.transform.dates.MaintenancePeriodsResponseParser parser = new com.clarusft.api.transform.dates.MaintenancePeriodsResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.trade.ConvertResponse request(com.clarusft.api.model.trade.ConvertRequest request) throws ApiException {
		com.clarusft.api.transform.trade.ConvertResponseParser parser = new com.clarusft.api.transform.trade.ConvertResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.load.LadderResponse request(com.clarusft.api.model.load.LadderRequest request) throws ApiException {
		com.clarusft.api.transform.load.LadderResponseParser parser = new com.clarusft.api.transform.load.LadderResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.util.DomainResponse request(com.clarusft.api.model.util.DomainRequest request) throws ApiException {
		com.clarusft.api.transform.util.DomainResponseParser parser = new com.clarusft.api.transform.util.DomainResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.etd.ETDIMResponse request(com.clarusft.api.model.etd.ETDIMRequest request) throws ApiException {
		com.clarusft.api.transform.etd.ETDIMResponseParser parser = new com.clarusft.api.transform.etd.ETDIMResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.frtb.ModellableRFTradesResponse request(com.clarusft.api.model.frtb.ModellableRFTradesRequest request) throws ApiException {
		com.clarusft.api.transform.frtb.ModellableRFTradesResponseParser parser = new com.clarusft.api.transform.frtb.ModellableRFTradesResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.mifid.FIRDSResponse request(com.clarusft.api.model.mifid.FIRDSRequest request) throws ApiException {
		com.clarusft.api.transform.mifid.FIRDSResponseParser parser = new com.clarusft.api.transform.mifid.FIRDSResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.margin.OptimiserResponse request(com.clarusft.api.model.margin.OptimiserRequest request) throws ApiException {
		com.clarusft.api.transform.margin.OptimiserResponseParser parser = new com.clarusft.api.transform.margin.OptimiserResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.risk.IRGammaResponse request(com.clarusft.api.model.risk.IRGammaRequest request) throws ApiException {
		com.clarusft.api.transform.risk.IRGammaResponseParser parser = new com.clarusft.api.transform.risk.IRGammaResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.compliance.ClearingEligibleResponse request(com.clarusft.api.model.compliance.ClearingEligibleRequest request) throws ApiException {
		com.clarusft.api.transform.compliance.ClearingEligibleResponseParser parser = new com.clarusft.api.transform.compliance.ClearingEligibleResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.market.DFResponse request(com.clarusft.api.model.market.DFRequest request) throws ApiException {
		com.clarusft.api.transform.market.DFResponseParser parser = new com.clarusft.api.transform.market.DFResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.hedge.Equivalents01Response request(com.clarusft.api.model.hedge.Equivalents01Request request) throws ApiException {
		com.clarusft.api.transform.hedge.Equivalents01ResponseParser parser = new com.clarusft.api.transform.hedge.Equivalents01ResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.load.MarketResponse request(com.clarusft.api.model.load.MarketRequest request) throws ApiException {
		com.clarusft.api.transform.load.MarketResponseParser parser = new com.clarusft.api.transform.load.MarketResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.sdr.LastPriceResponse request(com.clarusft.api.model.sdr.LastPriceRequest request) throws ApiException {
		com.clarusft.api.transform.sdr.LastPriceResponseParser parser = new com.clarusft.api.transform.sdr.LastPriceResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.simm.ImpactResponse request(com.clarusft.api.model.simm.ImpactRequest request) throws ApiException {
		com.clarusft.api.transform.simm.ImpactResponseParser parser = new com.clarusft.api.transform.simm.ImpactResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.xva.MVAResponse request(com.clarusft.api.model.xva.MVARequest request) throws ApiException {
		com.clarusft.api.transform.xva.MVAResponseParser parser = new com.clarusft.api.transform.xva.MVAResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.market.FixingsResponse request(com.clarusft.api.model.market.FixingsRequest request) throws ApiException {
		com.clarusft.api.transform.market.FixingsResponseParser parser = new com.clarusft.api.transform.market.FixingsResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.risk.DV01Response request(com.clarusft.api.model.risk.DV01Request request) throws ApiException {
		com.clarusft.api.transform.risk.DV01ResponseParser parser = new com.clarusft.api.transform.risk.DV01ResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.sdr.VolumeResponse request(com.clarusft.api.model.sdr.VolumeRequest request) throws ApiException {
		com.clarusft.api.transform.sdr.VolumeResponseParser parser = new com.clarusft.api.transform.sdr.VolumeResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.margin.ImpactResponse request(com.clarusft.api.model.margin.ImpactRequest request) throws ApiException {
		com.clarusft.api.transform.margin.ImpactResponseParser parser = new com.clarusft.api.transform.margin.ImpactResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.margin.VMResponse request(com.clarusft.api.model.margin.VMRequest request) throws ApiException {
		com.clarusft.api.transform.margin.VMResponseParser parser = new com.clarusft.api.transform.margin.VMResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.util.GridResponse request(com.clarusft.api.model.util.GridRequest request) throws ApiException {
		com.clarusft.api.transform.util.GridResponseParser parser = new com.clarusft.api.transform.util.GridResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.portfolio.CashByDateResponse request(com.clarusft.api.model.portfolio.CashByDateRequest request) throws ApiException {
		com.clarusft.api.transform.portfolio.CashByDateResponseParser parser = new com.clarusft.api.transform.portfolio.CashByDateResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.portfolio.NotionalResponse request(com.clarusft.api.model.portfolio.NotionalRequest request) throws ApiException {
		com.clarusft.api.transform.portfolio.NotionalResponseParser parser = new com.clarusft.api.transform.portfolio.NotionalResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.trade.CashflowsResponse request(com.clarusft.api.model.trade.CashflowsRequest request) throws ApiException {
		com.clarusft.api.transform.trade.CashflowsResponseParser parser = new com.clarusft.api.transform.trade.CashflowsResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.frtb.IMAImpactResponse request(com.clarusft.api.model.frtb.IMAImpactRequest request) throws ApiException {
		com.clarusft.api.transform.frtb.IMAImpactResponseParser parser = new com.clarusft.api.transform.frtb.IMAImpactResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.market.ZeroRatesResponse request(com.clarusft.api.model.market.ZeroRatesRequest request) throws ApiException {
		com.clarusft.api.transform.market.ZeroRatesResponseParser parser = new com.clarusft.api.transform.market.ZeroRatesResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.compliance.ClearingMandatoryResponse request(com.clarusft.api.model.compliance.ClearingMandatoryRequest request) throws ApiException {
		com.clarusft.api.transform.compliance.ClearingMandatoryResponseParser parser = new com.clarusft.api.transform.compliance.ClearingMandatoryResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.portfolio.MTMResponse request(com.clarusft.api.model.portfolio.MTMRequest request) throws ApiException {
		com.clarusft.api.transform.portfolio.MTMResponseParser parser = new com.clarusft.api.transform.portfolio.MTMResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.risk.VaRResponse request(com.clarusft.api.model.risk.VaRRequest request) throws ApiException {
		com.clarusft.api.transform.risk.VaRResponseParser parser = new com.clarusft.api.transform.risk.VaRResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.market.FuturesResponse request(com.clarusft.api.model.market.FuturesRequest request) throws ApiException {
		com.clarusft.api.transform.market.FuturesResponseParser parser = new com.clarusft.api.transform.market.FuturesResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.util.PeriodLengthResponse request(com.clarusft.api.model.util.PeriodLengthRequest request) throws ApiException {
		com.clarusft.api.transform.util.PeriodLengthResponseParser parser = new com.clarusft.api.transform.util.PeriodLengthResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.sdr.VolumeADVResponse request(com.clarusft.api.model.sdr.VolumeADVRequest request) throws ApiException {
		com.clarusft.api.transform.sdr.VolumeADVResponseParser parser = new com.clarusft.api.transform.sdr.VolumeADVResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.simm.BackTestResponse request(com.clarusft.api.model.simm.BackTestRequest request) throws ApiException {
		com.clarusft.api.transform.simm.BackTestResponseParser parser = new com.clarusft.api.transform.simm.BackTestResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.trade.ValidateResponse request(com.clarusft.api.model.trade.ValidateRequest request) throws ApiException {
		com.clarusft.api.transform.trade.ValidateResponseParser parser = new com.clarusft.api.transform.trade.ValidateResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.load.PortfolioResponse request(com.clarusft.api.model.load.PortfolioRequest request) throws ApiException {
		com.clarusft.api.transform.load.PortfolioResponseParser parser = new com.clarusft.api.transform.load.PortfolioResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.portfolio.CashResponse request(com.clarusft.api.model.portfolio.CashRequest request) throws ApiException {
		com.clarusft.api.transform.portfolio.CashResponseParser parser = new com.clarusft.api.transform.portfolio.CashResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.risk.ThetaResponse request(com.clarusft.api.model.risk.ThetaRequest request) throws ApiException {
		com.clarusft.api.transform.risk.ThetaResponseParser parser = new com.clarusft.api.transform.risk.ThetaResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.risk.IRVegaResponse request(com.clarusft.api.model.risk.IRVegaRequest request) throws ApiException {
		com.clarusft.api.transform.risk.IRVegaResponseParser parser = new com.clarusft.api.transform.risk.IRVegaResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.xva.SensitivityResponse request(com.clarusft.api.model.xva.SensitivityRequest request) throws ApiException {
		com.clarusft.api.transform.xva.SensitivityResponseParser parser = new com.clarusft.api.transform.xva.SensitivityResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.portfolio.FixingsResponse request(com.clarusft.api.model.portfolio.FixingsRequest request) throws ApiException {
		com.clarusft.api.transform.portfolio.FixingsResponseParser parser = new com.clarusft.api.transform.portfolio.FixingsResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.sdr.LastTradeResponse request(com.clarusft.api.model.sdr.LastTradeRequest request) throws ApiException {
		com.clarusft.api.transform.sdr.LastTradeResponseParser parser = new com.clarusft.api.transform.sdr.LastTradeResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.margin.ParSwapsIMResponse request(com.clarusft.api.model.margin.ParSwapsIMRequest request) throws ApiException {
		com.clarusft.api.transform.margin.ParSwapsIMResponseParser parser = new com.clarusft.api.transform.margin.ParSwapsIMResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.simm.MarginResponse request(com.clarusft.api.model.simm.MarginRequest request) throws ApiException {
		com.clarusft.api.transform.simm.MarginResponseParser parser = new com.clarusft.api.transform.simm.MarginResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.credit.SACCRResponse request(com.clarusft.api.model.credit.SACCRRequest request) throws ApiException {
		com.clarusft.api.transform.credit.SACCRResponseParser parser = new com.clarusft.api.transform.credit.SACCRResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.risk.IRDeltaResponse request(com.clarusft.api.model.risk.IRDeltaRequest request) throws ApiException {
		com.clarusft.api.transform.risk.IRDeltaResponseParser parser = new com.clarusft.api.transform.risk.IRDeltaResponseParser();

		return requestImpl(request, parser);
	}
		
	public com.clarusft.api.model.risk.FXDeltaResponse request(com.clarusft.api.model.risk.FXDeltaRequest request) throws ApiException {
		com.clarusft.api.transform.risk.FXDeltaResponseParser parser = new com.clarusft.api.transform.risk.FXDeltaResponseParser();

		return requestImpl(request, parser);
	}
		


	@Override
	protected void setDrilldownProvider(com.clarusft.api.model.SupportsDrilldown supportsDrilldown) {
		supportsDrilldown.setDrilldownProvider(new com.clarusft.api.model.DrilldownProvider() {
			@Override
			public com.clarusft.api.model.DrilldownResponse drilldown(Integer gridId, String row, String col, String view) {
				com.clarusft.api.model.util.GridRequest request = new com.clarusft.api.model.util.GridRequest();

				if (gridId != null) request.setGridId(gridId);
				if (row != null)	request.setDrilldownRow(row);
				if (col != null)	request.setDrilldownCol(col);
				if (view != null)	request.setDrilldownView(view);

				com.clarusft.api.model.util.GridResponse response = request(request);

				com.clarusft.api.model.DrilldownResponse ddResponse = new com.clarusft.api.model.DrilldownResponse();
				ddResponse.setHttpResponse(response.getHttpResponse());
				ddResponse.setGrid(response.getGrid());
				ddResponse.setStats(response.getStats());

				ddResponse.setDrilldownProvider(this);

				return ddResponse;
			}
		});
	}

	@Override
	protected void setPivotProvider(com.clarusft.api.model.SupportsPivot supportsPivot) {
		supportsPivot.setPivotProvider(new com.clarusft.api.model.PivotProvider() {

			@Override
			public com.clarusft.api.model.PivotResponse pivot(Integer gridId, String row, String col, String ccy, String view)
					throws ApiException {
				com.clarusft.api.model.util.GridRequest request = new com.clarusft.api.model.util.GridRequest();

				if (gridId != null) request.setGridId(gridId);
				if (row != null)	request.setRow(row);
				if (col != null)	request.setCol(col);
				if (ccy != null)	request.setReportCcy(ccy);
				if (view != null)	request.setView(view);

				com.clarusft.api.model.util.GridResponse response = request(request);

				com.clarusft.api.model.PivotResponse pivotResponse = new com.clarusft.api.model.PivotResponse();
				pivotResponse.setHttpResponse(response.getHttpResponse());
				pivotResponse.setGrid(response.getGrid());
				pivotResponse.setStats(response.getStats());

				return pivotResponse;
			}

		});
	}

	@Override
	protected void setTransposeProvider(com.clarusft.api.model.SupportsTranspose supportsTranspose) {
		supportsTranspose.setTransposeProvider(new com.clarusft.api.model.TransposeProvider() {

			@Override
			public com.clarusft.api.model.TransposeResponse transpose(Integer gridId)
					throws ApiException {
				com.clarusft.api.model.util.GridRequest request = new com.clarusft.api.model.util.GridRequest();

				if (gridId != null) request.setGridId(gridId);
				request.setRow("Transpose");
				request.setCol("Transpose");

				com.clarusft.api.model.util.GridResponse response = request(request);

				com.clarusft.api.model.TransposeResponse transposeResponse = new com.clarusft.api.model.TransposeResponse();
				transposeResponse.setHttpResponse(response.getHttpResponse());
				transposeResponse.setGrid(response.getGrid());
				transposeResponse.setStats(response.getStats());

				return transposeResponse;
			}
		});
	}


	@Override
	protected void setFilterProvider(com.clarusft.api.model.SupportsFilter supportsFilter) {
		supportsFilter.setFilterProvider(new com.clarusft.api.model.FilterProvider() {

			@Override
			public com.clarusft.api.model.FilterResponse filter(Integer gridId, String filter)
					throws ApiException {
				com.clarusft.api.model.util.GridRequest request = new com.clarusft.api.model.util.GridRequest();

				if (gridId != null) request.setGridId(gridId);
				if (filter != null)	request.setFilter(filter);

				com.clarusft.api.model.util.GridResponse response = request(request);

				com.clarusft.api.model.FilterResponse filterResponse = new com.clarusft.api.model.FilterResponse();
				filterResponse.setHttpResponse(response.getHttpResponse());
				filterResponse.setGrid(response.getGrid());
				filterResponse.setStats(response.getStats());

				return filterResponse;
			}
		});
	}

}