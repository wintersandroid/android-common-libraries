/* 
 * Copyright (C) 2008 OpenIntents.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package nz.org.winters.android.fileselector;


// Version Dec 9, 2008

/**
 * Provides OpenIntents actions, extras, and categories used by providers.
 * <p>
 * These specifiers extend the standard Android specifiers.
 * </p>
 */
public final class FileManagerIntents
{

  /**
   * Activity Action: Pick a file through the file manager, or let user specify
   * a custom file name. Data is the current file name or file name suggestion.
   * Returns a new file name as file URI in data.
   * 
   * <p>
   * Constant Value: "org.openintents.action.PICK_FILE"
   * </p>
   */
  public static final String ACTION_PICK_FILE      = "nz.org.winters.android.fileselector.action.PICK_FILE";

  /**
   * Activity Action: Pick a directory through the file manager, or let user
   * specify a custom file name. Data is the current directory name or directory
   * name suggestion. Returns a new directory name as file URI in data.
   * 
   * <p>
   * Constant Value: "org.openintents.action.PICK_DIRECTORY"
   * </p>
   */
  public static final String ACTION_PICK_DIRECTORY = "nz.org.winters.android.fileselector.PICK_DIRECTORY";

  /**
   * Activity Action: Move, copy or delete after select entries. Data is the
   * current directory name or directory name suggestion.
   * 
   * <p>
   * Constant Value: "org.openintents.action.MULTI_SELECT"
   * </p>
   */
  public static final String ACTION_MULTI_SELECT   = "nz.org.winters.android.fileselector.MULTI_SELECT";

  /**
   * The title to display.
   * 
   * <p>
   * This is shown in the title bar of the file manager.
   * </p>
   * 
   * <p>
   * Constant Value: "org.openintents.extra.TITLE"
   * </p>
   */
  public static final String EXTRA_TITLE           = "nz.org.winters.android.fileselector.extra.TITLE";
  public static final String EXTRA_FILEPATH        = "nz.org.winters.android.fileselector.extra.FILEPATH";

  /**
   * The text on the button to display.
   * 
   * <p>
   * Depending on the use, it makes sense to set this to "Open" or "Save".
   * </p>
   * 
   * <p>
   * Constant Value: "org.openintents.extra.BUTTON_TEXT"
   * </p>
   */
  public static final String EXTRA_BUTTON_TEXT     = "nz.org.winters.android.fileselector.extra.BUTTON_TEXT";

  /**
   * Flag indicating to show only writeable files and folders.
   * 
   * <p>
   * Constant Value: "org.openintents.extra.WRITEABLE_ONLY"
   * </p>
   */
  public static final String EXTRA_WRITEABLE_ONLY  = "nz.org.winters.android.fileselector.extra.WRITEABLE_ONLY";

}
