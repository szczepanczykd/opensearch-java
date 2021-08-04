/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.clients.opensearch._types;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.StoreStats
@JsonpDeserializable
public class StoreStats implements JsonpSerializable {
	@Nullable
	private final String size;

	private final int sizeInBytes;

	@Nullable
	private final String reserved;

	private final int reservedInBytes;

	@Nullable
	private final String totalDataSetSize;

	@Nullable
	private final Integer totalDataSetSizeInBytes;

	// ---------------------------------------------------------------------------------------------

	private StoreStats(Builder builder) {

		this.size = builder.size;
		this.sizeInBytes = ModelTypeHelper.requireNonNull(builder.sizeInBytes, this, "sizeInBytes");
		this.reserved = builder.reserved;
		this.reservedInBytes = ModelTypeHelper.requireNonNull(builder.reservedInBytes, this, "reservedInBytes");
		this.totalDataSetSize = builder.totalDataSetSize;
		this.totalDataSetSizeInBytes = builder.totalDataSetSizeInBytes;

	}

	public static StoreStats of(Function<Builder, ObjectBuilder<StoreStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public final String size() {
		return this.size;
	}

	/**
	 * Required - API name: {@code size_in_bytes}
	 */
	public final int sizeInBytes() {
		return this.sizeInBytes;
	}

	/**
	 * API name: {@code reserved}
	 */
	@Nullable
	public final String reserved() {
		return this.reserved;
	}

	/**
	 * Required - API name: {@code reserved_in_bytes}
	 */
	public final int reservedInBytes() {
		return this.reservedInBytes;
	}

	/**
	 * API name: {@code total_data_set_size}
	 */
	@Nullable
	public final String totalDataSetSize() {
		return this.totalDataSetSize;
	}

	/**
	 * API name: {@code total_data_set_size_in_bytes}
	 */
	@Nullable
	public final Integer totalDataSetSizeInBytes() {
		return this.totalDataSetSizeInBytes;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}
		generator.writeKey("size_in_bytes");
		generator.write(this.sizeInBytes);

		if (this.reserved != null) {
			generator.writeKey("reserved");
			generator.write(this.reserved);

		}
		generator.writeKey("reserved_in_bytes");
		generator.write(this.reservedInBytes);

		if (this.totalDataSetSize != null) {
			generator.writeKey("total_data_set_size");
			generator.write(this.totalDataSetSize);

		}
		if (this.totalDataSetSizeInBytes != null) {
			generator.writeKey("total_data_set_size_in_bytes");
			generator.write(this.totalDataSetSizeInBytes);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StoreStats}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<StoreStats> {
		@Nullable
		private String size;

		private Integer sizeInBytes;

		@Nullable
		private String reserved;

		private Integer reservedInBytes;

		@Nullable
		private String totalDataSetSize;

		@Nullable
		private Integer totalDataSetSizeInBytes;

		/**
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable String value) {
			this.size = value;
			return this;
		}

		/**
		 * Required - API name: {@code size_in_bytes}
		 */
		public final Builder sizeInBytes(int value) {
			this.sizeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code reserved}
		 */
		public final Builder reserved(@Nullable String value) {
			this.reserved = value;
			return this;
		}

		/**
		 * Required - API name: {@code reserved_in_bytes}
		 */
		public final Builder reservedInBytes(int value) {
			this.reservedInBytes = value;
			return this;
		}

		/**
		 * API name: {@code total_data_set_size}
		 */
		public final Builder totalDataSetSize(@Nullable String value) {
			this.totalDataSetSize = value;
			return this;
		}

		/**
		 * API name: {@code total_data_set_size_in_bytes}
		 */
		public final Builder totalDataSetSizeInBytes(@Nullable Integer value) {
			this.totalDataSetSizeInBytes = value;
			return this;
		}

		/**
		 * Builds a {@link StoreStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StoreStats build() {
			_checkSingleUse();

			return new StoreStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StoreStats}
	 */
	public static final JsonpDeserializer<StoreStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			StoreStats::setupStoreStatsDeserializer, Builder::build);

	protected static void setupStoreStatsDeserializer(DelegatingDeserializer<StoreStats.Builder> op) {

		op.add(Builder::size, JsonpDeserializer.stringDeserializer(), "size");
		op.add(Builder::sizeInBytes, JsonpDeserializer.integerDeserializer(), "size_in_bytes");
		op.add(Builder::reserved, JsonpDeserializer.stringDeserializer(), "reserved");
		op.add(Builder::reservedInBytes, JsonpDeserializer.integerDeserializer(), "reserved_in_bytes");
		op.add(Builder::totalDataSetSize, JsonpDeserializer.stringDeserializer(), "total_data_set_size");
		op.add(Builder::totalDataSetSizeInBytes, JsonpDeserializer.integerDeserializer(),
				"total_data_set_size_in_bytes");

	}

}
