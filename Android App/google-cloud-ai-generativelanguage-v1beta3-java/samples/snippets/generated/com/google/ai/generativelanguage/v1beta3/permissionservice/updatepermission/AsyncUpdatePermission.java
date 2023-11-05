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

// [START generativelanguage_v1beta3_generated_PermissionService_UpdatePermission_async]
import com.google.ai.generativelanguage.v1beta3.Permission;
import com.google.ai.generativelanguage.v1beta3.PermissionServiceClient;
import com.google.ai.generativelanguage.v1beta3.UpdatePermissionRequest;
import com.google.api.core.ApiFuture;
import com.google.protobuf.FieldMask;

public class AsyncUpdatePermission {

  public static void main(String[] args) throws Exception {
    asyncUpdatePermission();
  }

  public static void asyncUpdatePermission() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (PermissionServiceClient permissionServiceClient = PermissionServiceClient.create()) {
      UpdatePermissionRequest request =
          UpdatePermissionRequest.newBuilder()
              .setPermission(Permission.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      ApiFuture<Permission> future =
          permissionServiceClient.updatePermissionCallable().futureCall(request);
      // Do something.
      Permission response = future.get();
    }
  }
}
// [END generativelanguage_v1beta3_generated_PermissionService_UpdatePermission_async]