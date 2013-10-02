/*******************************************************************************
 * This file is part of the Coporate Semantic Web Project.
 * 
 * This work has been partially supported by the ``InnoProfile-Corporate Semantic Web" project funded by the German Federal 
 * Ministry of Education and Research (BMBF) and the BMBF Innovation Initiative for the New German Laender - Entrepreneurial Regions.
 * 
 * http://www.corporate-semantic-web.de/
 * 
 * 
 * Freie Universitaet Berlin
 * Copyright (c) 2007-2013
 * 
 * 
 * Institut fuer Informatik
 * Working Group Coporate Semantic Web
 * Koenigin-Luise-Strasse 24-26
 * 14195 Berlin
 * 
 * http://www.mi.fu-berlin.de/en/inf/groups/ag-csw/
 * 
 *  
 * 
 * This library is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License as published 
 * by the Free Software Foundation; either version 3 of the License, or (at your option) any later version.
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY 
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License along with this library; if not, write to the Free Software Foundation, 
 * Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA or see <http://www.gnu.org/licenses/>
 ******************************************************************************/
package loomp.oca.client;

/**
 * Interface to represent the messages contained in resource bundle:
 * 	L:/projects/csw/loomp/gwt/src/gwt/loomp/oca/client/OneClickAnnotatorMessages.properties'.
 */
public interface OneClickAnnotatorMessages extends com.google.gwt.i18n.client.Messages {
  
  /**
   * Translated "Unable to load {0}.".
   * 
   * @return translated "Unable to load {0}."
   */
  @DefaultMessage("Unable to load {0}.")
  @Key("error.load.message")
  String error_load_message(String arg0);

  /**
   * Translated "The version of loomp API is {0}.".
   * 
   * @return translated "The version of loomp API is {0}."
   */
  @DefaultMessage("The version of loomp API is {0}.")
  @Key("oca.dialog.version.heading")
  String oca_dialog_version_heading(String arg0);
}
