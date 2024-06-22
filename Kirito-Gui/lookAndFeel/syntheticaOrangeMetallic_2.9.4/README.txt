Intro
=====

Synthetica is a 'Look and Feel' for Swing and is based on Synth which is part of version 1.5 
of the Java2 Platform, Standard Edition. It provides components with rounded borders, 
shadowed popup menus, nice icons and a new, fresh look. Moreover it enables you to modify 
existing LAF's, or to create your own LAF only by editing a xml based configuration file. 
You don't have to write komplex Java-GUI-Code, but you can integrate own code by your needs.

Home page
=========

General:        http://www.jyloo.com
Synthetica:     http://www.jyloo.com/synthetica
FAQ:            http://www.jyloo.com/synthetica/faq
Download:       http://www.jyloo.com/synthetica/download
Locense:        http://www.jyloo.com/synthetica/license

Contact Addresses
=================

General:        info@jyloo.com
Sales:          sales@jyloo.com	
Support:        support@jyloo.com

System Requirements
===================

Java SE 5 (JRE 1.5.0) or above
Synthetica V2.2.0 or above

Integration
===========

1. Ensure that your classpath contains all Synthetica libraries (including
   Synthetica's core library 'synthetica.jar').

2. Enable the Synthetica Look and Feel at startup time in your application:

    import de.javasoft.plaf.synthetica.SyntheticaOrangeMetallicLookAndFeel;

    try 
    {
      UIManager.setLookAndFeel(new SyntheticaOrangeMetallicLookAndFeel());
    } 
    catch (Exception e) 
    {
      e.printStackTrace();
    }
