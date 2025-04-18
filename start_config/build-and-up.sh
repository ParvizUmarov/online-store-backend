#!/bin/bash

set -e

ROOT_DIR="$(cd "$(dirname "$0")/.." && pwd)"
GRADLEW="$ROOT_DIR/gradlew"

MODULES=("user_service" "item_service" "warehouse_service" "cash_opearation_service" "gateway")

echo "🔨 Сборка всех сервисов..."

for module in "${MODULES[@]}"; do
  echo "📦 Сборка модуля: $module"
  cd "$ROOT_DIR/$module"
  "$GRADLEW" build -x test
  cd "$ROOT_DIR"
done

echo "🐳 Запуск docker compose..."
cd "$ROOT_DIR/start_config"
docker compose up --build