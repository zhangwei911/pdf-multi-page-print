/*    */ package wf.common;
/*    */ 
/*    */ import java.awt.Dimension;
/*    */ import java.awt.Font;
/*    */ import java.awt.GraphicsEnvironment;
/*    */ import java.awt.Toolkit;
/*    */ 
/*    */ public final class SystemProperties
/*    */ {
/*  7 */   public static final double SCREEN_WIDTH = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
/*  8 */   public static final double SCREEN_HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
/*  9 */   public static final String USER_DIR = System.getProperty("user.dir");
/* 10 */   public static final String USER_HOME = System.getProperty("user.home");
/* 11 */   public static final String USER_NAME = System.getProperty("user.name");
/* 12 */   public static final String FILE_SEPARATOR = System.getProperty("file.separator");
/* 13 */   public static final String LINE_SEPARATOR = System.getProperty("line.separator");
/* 14 */   public static final String PATH_SEPARATOR = System.getProperty("path.separator");
/* 15 */   public static final String JAVA_HOME = System.getProperty("java.home");
/* 16 */   public static final String JAVA_VENDOR = System.getProperty("java.vendor");
/* 17 */   public static final String JAVA_VENDOR_URL = System.getProperty("java.vendor.url");
/* 18 */   public static final String JAVA_VERSION = System.getProperty("java.version");
/* 19 */   public static final String JAVA_CLASS_PATH = System.getProperty("java.class.path");
/* 20 */   public static final String JAVA_CLASS_VERSION = System.getProperty("java.class.version");
/* 21 */   public static final String OS_NAME = System.getProperty("os.name");
/* 22 */   public static final String OS_ARCH = System.getProperty("os.arch");
/* 23 */   public static final String OS_VERSION = System.getProperty("os.version");
/* 24 */   public static final String[] FONT_NAME_LIST = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
/* 25 */   public static final Font[] FONT_LIST = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();
/*    */ }

/* Location:           C:\Users\swtf\桌面\
 * Qualified Name:     wf.common.SystemProperties
 * JD-Core Version:    0.5.4
 */