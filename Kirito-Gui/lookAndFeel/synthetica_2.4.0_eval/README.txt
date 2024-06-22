Intro
=====

Synthetica is a 'Look and Feel' for Swing and is based on Synth which is part of version 1.5 
of the Java2 Platform, Standard Edition. It provides components with rounded borders, 
shadowed popup menus, nice icons and a new, fresh look. Moreover it enables you to modify 
existing LAF's, or to create your own LAF only by editing a xml based configuration file. 
You don't have to write komplex Java-GUI-Code, but you can integrate own code by your needs.

Home page
=========

General:        http://www.javasoft.de
Synthetica:     http://javasoft.zgalaxy.de/jsf/public/products/synthetica
FAQ:            http://javasoft.zgalaxy.de/jsf/public/products/synthetica/faq
Download:       http://www.javasoft.de/jsf/public/products/synthetica/download
Purchase:       http://www.javasoft.de/jsf/public/products/synthetica/purchase

Contact Addresses
=================

General:        info@javasoft.de
Sales:          sales@javasoft.de	
Support:        support@javasoft.de

System Requirements
===================

Java SE 5 (JRE 1.5.0) or later

Integration
===========

1. Ensure that your classpath contains all Synthetica libraries.

2. Enable the Synthetica Look and Feel in your application:

    import de.javasoft.plaf.synthetica.SyntheticaStandardLookAndFeel;

    try 
    {
      UIManager.setLookAndFeel(new SyntheticaStandardLookAndFeel());
    } 
    catch (Exception e) 
    {
      e.printStackTrace();
    }
