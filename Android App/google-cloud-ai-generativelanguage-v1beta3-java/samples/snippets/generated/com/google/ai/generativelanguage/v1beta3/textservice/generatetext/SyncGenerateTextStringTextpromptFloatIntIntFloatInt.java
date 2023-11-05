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

// [START generativelanguage_v1beta3_generated_TextService_GenerateText_StringTextpromptFloatIntIntFloatInt_sync]
import com.google.ai.generativelanguage.v1beta3.GenerateTextResponse;
import com.google.ai.generativelanguage.v1beta3.TextPrompt;
import com.google.ai.generativelanguage.v1beta3.TextServiceClient;

public class SyncGenerateTextStringTextpromptFloatIntIntFloatInt {

  public static void main(String[] args) throws Exception {
    syncGenerateTextStringTextpromptFloatIntIntFloatInt();
  }

  public static void syncGenerateTextStringTextpromptFloatIntIntFloatInt() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (TextServiceClient textServiceClient = TextServiceClient.create()) {
      String model = "model104069929";
      TextPrompt prompt = TextPrompt.newBuilder().build();
      float temperature = 321701236;
      int candidateCount = 396483411;
      int maxOutputTokens = 1250078461;
      float topP = 110545926;
      int topK = 110545921;
      GenerateTextResponse response =
          textServiceClient.generateText(
              model, prompt, temperature, candidateCount, maxOutputTokens, topP, topK);
    }
  }
}
// [END generativelanguage_v1beta3_generated_TextService_GenerateText_StringTextpromptFloatIntIntFloatInt_sync]
