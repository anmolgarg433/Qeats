/*
 *
 *  * Copyright (c) Crio.Do 2019. All rights reserved
 *
 */

package com.crio.qeats.exchanges;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class GetRestaurantsRequest {
  @NonNull
  @Min(value = -90)
  @Max(value = 90)
  private Double latitude;
  @NonNull
  @Min(value = -180)
  @Max(value = 180)
  private Double longitude;
  

  public GetRestaurantsRequest(double d, double e) {
    this.latitude = d;
    this.longitude = e;
  }

  public Double getLongitude() {
    return longitude;
  }

  public Double getLatitude() {
    return latitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }
  
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }
    

}

