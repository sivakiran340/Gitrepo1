# A list of daily temperatures in Celsius
temperatures = [22, 15, 30, 12, 27, 18, 25]

# Filter temperatures that are above 20 degrees
warm_days = []
for temp in temperatures:
    if temp > 20:
        warm_days.append(temp)

print("Temperatures above 20°C:", warm_days)
print(f"Total warm days found: {len(warm_days)}")
