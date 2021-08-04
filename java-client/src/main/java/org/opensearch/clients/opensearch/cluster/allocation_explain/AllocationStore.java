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

package org.opensearch.clients.opensearch.cluster.allocation_explain;

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
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.function.Function;

// typedef: cluster.allocation_explain.AllocationStore
@JsonpDeserializable
public class AllocationStore implements JsonpSerializable {
	private final String allocationId;

	private final boolean found;

	private final boolean inSync;

	private final long matchingSizeInBytes;

	private final boolean matchingSyncId;

	private final String storeException;

	// ---------------------------------------------------------------------------------------------

	private AllocationStore(Builder builder) {

		this.allocationId = ModelTypeHelper.requireNonNull(builder.allocationId, this, "allocationId");
		this.found = ModelTypeHelper.requireNonNull(builder.found, this, "found");
		this.inSync = ModelTypeHelper.requireNonNull(builder.inSync, this, "inSync");
		this.matchingSizeInBytes = ModelTypeHelper.requireNonNull(builder.matchingSizeInBytes, this,
				"matchingSizeInBytes");
		this.matchingSyncId = ModelTypeHelper.requireNonNull(builder.matchingSyncId, this, "matchingSyncId");
		this.storeException = ModelTypeHelper.requireNonNull(builder.storeException, this, "storeException");

	}

	public static AllocationStore of(Function<Builder, ObjectBuilder<AllocationStore>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code allocation_id}
	 */
	public final String allocationId() {
		return this.allocationId;
	}

	/**
	 * Required - API name: {@code found}
	 */
	public final boolean found() {
		return this.found;
	}

	/**
	 * Required - API name: {@code in_sync}
	 */
	public final boolean inSync() {
		return this.inSync;
	}

	/**
	 * Required - API name: {@code matching_size_in_bytes}
	 */
	public final long matchingSizeInBytes() {
		return this.matchingSizeInBytes;
	}

	/**
	 * Required - API name: {@code matching_sync_id}
	 */
	public final boolean matchingSyncId() {
		return this.matchingSyncId;
	}

	/**
	 * Required - API name: {@code store_exception}
	 */
	public final String storeException() {
		return this.storeException;
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

		generator.writeKey("allocation_id");
		generator.write(this.allocationId);

		generator.writeKey("found");
		generator.write(this.found);

		generator.writeKey("in_sync");
		generator.write(this.inSync);

		generator.writeKey("matching_size_in_bytes");
		generator.write(this.matchingSizeInBytes);

		generator.writeKey("matching_sync_id");
		generator.write(this.matchingSyncId);

		generator.writeKey("store_exception");
		generator.write(this.storeException);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AllocationStore}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<AllocationStore> {
		private String allocationId;

		private Boolean found;

		private Boolean inSync;

		private Long matchingSizeInBytes;

		private Boolean matchingSyncId;

		private String storeException;

		/**
		 * Required - API name: {@code allocation_id}
		 */
		public final Builder allocationId(String value) {
			this.allocationId = value;
			return this;
		}

		/**
		 * Required - API name: {@code found}
		 */
		public final Builder found(boolean value) {
			this.found = value;
			return this;
		}

		/**
		 * Required - API name: {@code in_sync}
		 */
		public final Builder inSync(boolean value) {
			this.inSync = value;
			return this;
		}

		/**
		 * Required - API name: {@code matching_size_in_bytes}
		 */
		public final Builder matchingSizeInBytes(long value) {
			this.matchingSizeInBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code matching_sync_id}
		 */
		public final Builder matchingSyncId(boolean value) {
			this.matchingSyncId = value;
			return this;
		}

		/**
		 * Required - API name: {@code store_exception}
		 */
		public final Builder storeException(String value) {
			this.storeException = value;
			return this;
		}

		/**
		 * Builds a {@link AllocationStore}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AllocationStore build() {
			_checkSingleUse();

			return new AllocationStore(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AllocationStore}
	 */
	public static final JsonpDeserializer<AllocationStore> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			AllocationStore::setupAllocationStoreDeserializer, Builder::build);

	protected static void setupAllocationStoreDeserializer(DelegatingDeserializer<AllocationStore.Builder> op) {

		op.add(Builder::allocationId, JsonpDeserializer.stringDeserializer(), "allocation_id");
		op.add(Builder::found, JsonpDeserializer.booleanDeserializer(), "found");
		op.add(Builder::inSync, JsonpDeserializer.booleanDeserializer(), "in_sync");
		op.add(Builder::matchingSizeInBytes, JsonpDeserializer.longDeserializer(), "matching_size_in_bytes");
		op.add(Builder::matchingSyncId, JsonpDeserializer.booleanDeserializer(), "matching_sync_id");
		op.add(Builder::storeException, JsonpDeserializer.stringDeserializer(), "store_exception");

	}

}
