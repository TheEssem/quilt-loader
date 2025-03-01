/*
 * Copyright 2016 FabricMC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.quiltmc.loader.impl.metadata;


import org.quiltmc.json5.JsonReader;

@SuppressWarnings("serial")
public class ParseMetadataException extends Exception {
	public ParseMetadataException(String message) {
		super(message);
	}

	public ParseMetadataException(String message, JsonReader reader) {
		this(message + " Error was located at: " + reader.locationString());
	}

	public ParseMetadataException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public ParseMetadataException(Throwable t) {
		super(t);
	}

	public static class MissingRequired extends ParseMetadataException {
		public MissingRequired(String field) {
			super(String.format("Missing required field \"%s\".", field));
		}
	}
}
