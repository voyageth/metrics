package com.codahale.metrics;

public interface MetricSupplier<T extends Metric> {

	T createMetric();

}
