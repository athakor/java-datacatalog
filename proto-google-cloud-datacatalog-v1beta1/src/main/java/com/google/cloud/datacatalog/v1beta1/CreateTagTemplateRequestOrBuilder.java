/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/datacatalog.proto

package com.google.cloud.datacatalog.v1beta1;

public interface CreateTagTemplateRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.CreateTagTemplateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the project and the location this template is in.
   * Example:
   * * projects/{project_id}/locations/{location}
   * TagTemplate and its child resources may not actually be stored in the
   * location in this name.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The name of the project and the location this template is in.
   * Example:
   * * projects/{project_id}/locations/{location}
   * TagTemplate and its child resources may not actually be stored in the
   * location in this name.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The id of the tag template to create.
   * </pre>
   *
   * <code>string tag_template_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The tagTemplateId.
   */
  java.lang.String getTagTemplateId();
  /**
   *
   *
   * <pre>
   * Required. The id of the tag template to create.
   * </pre>
   *
   * <code>string tag_template_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for tagTemplateId.
   */
  com.google.protobuf.ByteString getTagTemplateIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The tag template to create.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the tagTemplate field is set.
   */
  boolean hasTagTemplate();
  /**
   *
   *
   * <pre>
   * Required. The tag template to create.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The tagTemplate.
   */
  com.google.cloud.datacatalog.v1beta1.TagTemplate getTagTemplate();
  /**
   *
   *
   * <pre>
   * Required. The tag template to create.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datacatalog.v1beta1.TagTemplateOrBuilder getTagTemplateOrBuilder();
}
