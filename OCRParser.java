package org.apache.tika.parser;


import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

import java.io.IOException;

/**
 *
 *
 **/
public interface OCRParser extends Parser {
  /**
   * Parse from an Image as a convenience method over {@link Parser#parse(java.io.InputStream, org.xml.sax.ContentHandler, org.apache.tika.metadata.Metadata, org.apache.tika.parser.ParseContext)}
   *
   * @param image    The Image to parse
   * @param handler  The {@link org.xml.sax.ContentHandler}
   * @param metadata The {@link org.apache.tika.metadata.Metadata}
   * @param context  The {@link ParseContext}
   * @throws IOException
   * @throws SAXException
   * @throws TikaException
   */
  public void parse(java.awt.Image image, ContentHandler handler, Metadata metadata, ParseContext context) throws IOException, SAXException, TikaException;
}
