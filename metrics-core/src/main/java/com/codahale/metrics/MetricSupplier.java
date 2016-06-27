package com.codahale.metrics;

@FunctionalInterface
public interface MetricSupplier<T extends Metric> {

	T createMetric();

}
