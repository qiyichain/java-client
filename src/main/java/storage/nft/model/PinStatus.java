/*
 * NFT Storage API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package storage.nft.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets PinStatus
 */
@JsonAdapter(PinStatus.Adapter.class)
public enum PinStatus {
  
  QUEUED("queued"),
  
  PINNING("pinning"),
  
  PINNED("pinned"),
  
  FAILED("failed");

  private String value;

  PinStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PinStatus fromValue(String value) {
    for (PinStatus b : PinStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PinStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final PinStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PinStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PinStatus.fromValue(value);
    }
  }
}

