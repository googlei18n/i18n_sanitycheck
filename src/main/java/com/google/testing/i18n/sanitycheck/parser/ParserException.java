/*
 *  Copyright 2014 Google Inc.
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
package com.google.testing.i18n.sanitycheck.parser;

/**
 * An object that represents an exception that would be thrown by {@link Parser} object if parsing
 * error happened.
 */
public class ParserException extends Exception {

  public ParserException(String message) {
    super(message);
  }
  
  public ParserException(String message, Throwable cause) {
    super(message, cause);
  }

}
