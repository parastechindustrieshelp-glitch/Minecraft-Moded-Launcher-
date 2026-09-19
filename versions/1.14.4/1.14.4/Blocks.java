public class Blocks {
  public static Block loom;
	public static Block barrel;
	public static Block stripped_oak_log;
	public static Block stripped_birch_log;
	public static Block stripped_acacia_log;
	public static Block stripped_jungle_log;
	public static Block stripped_spruce_log;
	public static Block stripped_dark_oak_log;
}

    static void doBootstrap() {
		if (!Bootstrap.isRegistered()) {
			throw new RuntimeException("Accessed Blocks before Bootstrap!");
		} else {
      loom = getRegisteredBlock("loom");
			barrel = getRegisteredBlock("barrel");
			stripped_oak_log = getRegisteredBlock("stripped_oak_log");
			stripped_birch_log = getRegisteredBlock("stripped_birch_log");
			stripped_acacia_log = getRegisteredBlock("stripped_acacia_log");
			stripped_jungle_log = getRegisteredBlock("stripped_jungle_log");
			stripped_spruce_log = getRegisteredBlock("stripped_spruce_log");
			stripped_dark_oak_log = getRegisteredBlock("stripped_dark_oak_log");
      }
