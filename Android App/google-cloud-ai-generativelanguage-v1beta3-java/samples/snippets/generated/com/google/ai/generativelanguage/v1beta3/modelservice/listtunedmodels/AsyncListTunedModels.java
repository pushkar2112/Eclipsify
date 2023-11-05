/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.ai.generativelanguage.v1beta3.samples;

// [START generativelanguage_v1beta3_generated_ModelService_ListTunedModels_async]
import com.google.ai.generativelanguage.v1beta3.ListTunedModelsRequest;
import com.google.ai.generativelanguage.v1beta3.ModelServiceClient;
import com.google.ai.generativelanguage.v1beta3.TunedModel;
import com.google.api.core.ApiFuture;

public class AsyncListTunedModels {

  public static void main(String[] args) throws Exception {
    asyncListTunedModels();
  }

  public static void asyncListTunedModels() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ModelServiceClient modelServiceClient = ModelServiceClient.create()) {
      ListTunedModelsRequest request =
          ListTunedModelsRequest.newBuilder()
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      ApiFuture<TunedModel> future =
          modelServiceClient.listTunedModelsPagedCallable().futureCall(request);
      // Do something.
      for (TunedModel element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END generativelanguage_v1beta3_generated_ModelService_ListTunedModels_async]
