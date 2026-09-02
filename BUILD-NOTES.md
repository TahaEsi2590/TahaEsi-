# ReNo VPN – real VPN core integration

This version keeps the existing UI/admin/data model and replaces the simulated VPN layer with a sing-box/libbox based runtime.

## What changed
- Existing admin panel still stores `rawConfig` and selects the same `VpnConfigItem`.
- The selected raw config is passed into the VPN service.
- URI formats supported by the converter: VLESS, VMess, Shadowsocks, Trojan, Hysteria2. Raw sing-box JSON is also accepted.
- Android `VpnService` TUN is created for the sing-box core.
- The service no longer reports fake random speeds. Upload/download counters use Android UID traffic counters.
- Existing logo/image resources were not replaced.
- Theme background tokens were changed to white/light surfaces; brand accent colors remain.

## Important
The native sing-box/libbox engine is a required runtime dependency. The project uses the `com.github.singbox-android:libbox:1.13.14` AAR through JitPack. The core's license is GPLv3; review and comply with its license when distributing the resulting APK.

The VPN engine is intentionally not claimed to be fully compatible with every possible vendor-specific URI parameter. For unusual Reality/XHTTP/advanced WireGuard configurations, use a raw sing-box JSON profile in the admin panel.
